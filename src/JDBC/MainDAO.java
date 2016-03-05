package JDBC;

import java.sql.SQLException;

public class MainDAO {
    public static void main(String[] args) throws SQLException {
        AbonentDAO abonent = new AbonentDAO();
        abonent.findAll();
    }
}
