package config;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class DatabaseConfig {

    public Connection createConnection() throws ClassNotFoundException, SQLException {
        Connection connection;
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:9999/postgres",
                "postgres",
                "rb31fermdss");
        connection.setAutoCommit(false);
        return connection;
    }
}
