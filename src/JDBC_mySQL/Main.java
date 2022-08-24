package JDBC_mySQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {

        /**select data executeQuery*/
//        try (Connection cn = ConnectorDB.getConnection();
//             Statement st = cn.createStatement();
//             ResultSet rs = st.executeQuery("SELECT * FROM phonebook")) {
//            ArrayList<Abonent> abonents = new ArrayList<>();
//
//            while (rs.next()) {
//                abonents.add(new Abonent(
//                        rs.getInt(1),
//                        rs.getInt(3),
//                        rs.getString(2))
//                );
//            }
//            if (abonents.size() > 0) {
//                System.out.println(abonents);
//            } else {
//                System.out.println("Not found");
//            }
//
//        } catch (SQLException e) {
//            System.err.println("DB connection error " + e);
//        }

        /**check db and content info*/
//        try (Connection connection = ConnectorDB.getConnection();
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery("SELECT * FROM phonebook");
//        ) {
//            ResultSetMetaData rsMetaData = resultSet.getMetaData();
//            System.out.println("count column " + rsMetaData.getColumnCount());
//            System.out.println("name second column " + rsMetaData.getColumnName(2));
//            System.out.println("type second column " + rsMetaData.getColumnType(2));
//
//            DatabaseMetaData dbMetaData = connection.getMetaData();
//            System.out.println("name db " + dbMetaData.getDatabaseProductName());
//            System.out.println("url db " + dbMetaData.getURL());
//        }


        /**insert some abonents */
        ArrayList<Abonent> abonents = new ArrayList<Abonent>(){
            {
                add(new Abonent(87, 1658468, "Кожух Дмитрий"));
                add(new Abonent(51, 8866711, "Буйкевич Александр"));
            }
        };

        DataBaseHelper helper = null;
        PreparedStatement statement = null;

        try{
            helper = new DataBaseHelper();
            statement = helper.getPreparedStatement();
            for (Abonent abonent : abonents){
                helper.insertAbonent(statement, abonent);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            helper.closeStatement(statement);
        }

    }


}

