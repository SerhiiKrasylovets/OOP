package JDBC;

import java.sql.*;

public class Table {
    private Connection con;

    public Table() {
        String url = "jdbc:mysql://localhost/test" +
                "?autoReconnect=true&useUnicode=true&characterEncoding=utf8";
        String name = "asd";
        String password = "asd";
        try {
            con = DriverManager.getConnection(url, name, password);
            System.out.println("Connected.");
            Statement st = con.createStatement();
            String query = "select * from c";
            ResultSet rs = st.executeQuery(query);
            printResults(rs);
            System.out.println("Disconnected.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void printResults(ResultSet rs) throws SQLException {
        String CName, City;
        double CNum, Rating, SNum;
        while (rs.next()) {
            CName = rs.getString("CName");
            City = rs.getString("City");
            CNum = rs.getDouble("CNum");
            Rating = rs.getDouble("Rating");
            SNum = rs.getDouble("SNum");
            System.out.println("******************************");
            System.out.println("CName: " + CName);
            System.out.println("City: " + City);
            System.out.println("CNum: " + CNum);
            System.out.println("Rating: " + Rating);
            System.out.println("SNum: " + SNum);
            System.out.println("******************************");
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Table test = new Table();
    }
}