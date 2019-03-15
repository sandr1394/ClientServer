package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountRepository {
    Statement statement;

    public void save(Connection connection, int id, String name, int bill) throws SQLException {
        statement = connection.createStatement();
        String sql = "INSERT INTO account (id,name, bill) VALUES (" + id + ", '" + name + "' ," + bill + ");";
        statement.executeUpdate(sql);
        connection.commit();
        System.out.println("\nDataBase contains following entities:");
    }

    public void get(Connection connection) throws SQLException {
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM account;");
        while (rs.next()) {
            int ID = rs.getInt("id");
            String NAME = rs.getString("name");
            int BILL = rs.getInt("bill");
            System.out.println(String.format("|ID: " + ID + "|  |NAME: " + NAME + "|  |BILL: " + BILL + "|"));
        }
    }
}
