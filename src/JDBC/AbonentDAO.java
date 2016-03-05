package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AbonentDAO extends AbstractDAO<Integer, Abonent> {
    public static final String SQL_SELECT_ALL_ABONENTS = "SELECT * FROM phonebook";

    @Override
    public List<Abonent> findAll() throws SQLException {
        List<Abonent> abonents = new ArrayList<>();
        Connection cn = null;
        java.sql.Statement st = null;
        try {
            cn = ConnectorDB.getConnection();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL_SELECT_ALL_ABONENTS);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int phone = rs.getInt(3);
                abonents.add(new Abonent(id, phone, name));
            }
        } catch (SQLException e){
            System.err.println("Exception"+e);
        }
        return null;
    }

    @Override
    public Abonent findEntityById(Integer Id) {
        return null;
    }

    @Override
    public boolean delete(Integer Id) {
        return false;
    }

    @Override
    public boolean delete(Abonent entity) {
        return false;
    }

    @Override
    public boolean create(Abonent entity) {
        return false;
    }

    @Override
    public Abonent update(Abonent entity) {
        return null;
    }
}
