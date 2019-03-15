package service;

import dao.AccountRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountService {

    AccountRepository accountRepository = new AccountRepository();


    public void saveAccount(Connection connection, int id, String name, int bill) throws SQLException {
        accountRepository.save(connection, id, name, bill);
    }

    public void getAll(Connection connection) throws SQLException {
        accountRepository.get(connection);
    }

}
