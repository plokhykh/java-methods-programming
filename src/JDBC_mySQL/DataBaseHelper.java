package JDBC_mySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHelper {
    private final static String SQL_INSERT = "INSERT INTO phonebook(idphonebook, lastname, phone) VALUES(?,?,?)";
    private Connection connect;

    public DataBaseHelper() throws SQLException {
        connect = ConnectorDB.getConnection();
    }

    public PreparedStatement getPreparedStatement() {
        PreparedStatement ps = null;
        try {
            ps = connect.prepareStatement(SQL_INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }

    public boolean insertAbonent (PreparedStatement ps, Abonent abonent){
        boolean flag = false;
        try{
            ps.setInt(1, abonent.getId());
            ps.setString(2, abonent.getName());
            ps.setInt(3, abonent.getPhone());
            ps.executeUpdate();
            flag = true;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    public void closeStatement (PreparedStatement ps){
        if(ps != null){
            try{
                ps.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
