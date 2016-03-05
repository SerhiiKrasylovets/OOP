package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class SimpleJDBCRunner {
    public static void main(String[] args) throws SQLException {
        Connection cn=null;
        cn=ConnectorDB.getConnection();
        Statement st = null;
        st=cn.createStatement();
        ResultSet rs = null;
        rs=st.executeQuery("SELECT * FROM phonebook");

        ArrayList<Abonent> lst = new ArrayList<>();
        while (rs.next()){
            int id  = rs.getInt(1);
            String name = rs.getString(2);
            int phone  = rs.getInt(3);
            lst.add(new Abonent(id, phone, name));

            if(lst.size()>0){
                System.out.println(lst);
            }else{
                System.out.println("Not found");
            }
        }
    }
}
