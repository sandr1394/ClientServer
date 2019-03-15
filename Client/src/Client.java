import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    Socket client;
    DataOutputStream out;
    DataInputStream in;

    public Client(int port) {
        try {
            client = new Socket("localhost", 7777);
            out = new DataOutputStream(client.getOutputStream());
            in = new DataInputStream(client.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startClientConnection() throws IOException {
        while (!client.isOutputShutdown()) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Insert ID:");
            int id = Integer.parseInt(sc.next());
            System.out.println("Insert NAME:");
            String name = sc.next();
            System.out.println("Insert BILL:");
            int bill = Integer.parseInt(sc.next());

            out.writeInt(id);
            out.writeUTF(name);
            out.writeInt(bill);
            if ((in.readUTF().equals("message"))) {
                System.out.println("-------INFO from Server-------\nServer got instance");
                System.out.println();
            }
        }
    }
}
