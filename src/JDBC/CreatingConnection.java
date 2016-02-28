package JDBC;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CreatingConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/mysql";
        String name = "asd";
        String password = "asd";

        try {
            Connection con = DriverManager.getConnection(url, name, password);
            System.out.println("Connected");
            con.close();
            System.out.println("Disconnected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
