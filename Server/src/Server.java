import config.DatabaseConfig;
import dao.AccountRepository;
import service.AccountService;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;

public class Server {
    ServerSocket serverSocket;
    Socket client;
    DataInputStream reader;
    DataOutputStream out;
    DatabaseConfig databaseConfig;
    Connection connection;

    public Server(int port) throws IOException, SQLException, ClassNotFoundException {
        serverSocket = new ServerSocket(port);
        System.out.println("-------INFO-------\nServer is deployed. ");
        initializeDB();
        connectClientToServer();

    }

    public void startAccountListener() throws IOException, SQLException {
        while (!client.isClosed()) {
            int id = reader.readInt();
            String name = reader.readUTF();
            int bill = reader.readInt();
            System.out.println("\nGot object: |Id - " + id + "|  |Name - " + name + "|  |Bill - " + bill + "|");
            out.writeUTF("message");
            AccountService accountService = new AccountService();
            accountService.saveAccount(connection, id, name, bill);
            accountService.getAll(connection);
        }
    }

    private void initializeDB() throws ClassNotFoundException, SQLException {
        databaseConfig = new DatabaseConfig();
        connection = databaseConfig.createConnection();
        System.out.println("-------INFO-------\nConnection with DataBase is established.");
    }

    private void connectClientToServer() throws IOException {
        System.out.println("-------INFO-------\nWaiting for client connection...");
        client = serverSocket.accept();
        System.out.println("-------INFO-------\nClient committed connection");
        reader = new DataInputStream(client.getInputStream());
        out = new DataOutputStream(client.getOutputStream());
    }
}
