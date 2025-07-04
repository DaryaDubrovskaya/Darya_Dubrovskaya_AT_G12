package classwork.day20;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.sql.*;
import java.util.Properties;

public class DbConnect {

    private static final Properties PROP = getProperties();

    public static void main(String[] args) {
       // PROP.forEach((k, v) -> System.out.println(v.toString()));

       // execStatement("Show tables;");
        execStatement("Select * from Employees limit 5;");

        String query = "SELECT * FROM Categories WHERE CategoryID = ?";
        execParametrizedStatement(query, 2);
    }

    private static Properties getProperties() {

        Properties prop = new Properties();

        try (InputStream input = new FileInputStream("src/test/resources/db.properties")) {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    private static MysqlDataSource getDataSource() {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(PROP.getProperty("HOST"));
        dataSource.setPort(Integer.parseInt(PROP.getProperty("PORT")));
        dataSource.setUser(PROP.getProperty("USER"));
        dataSource.setPassword(PROP.getProperty("PWD"));
        dataSource.setDatabaseName(PROP.getProperty("DBNAME"));

        return dataSource;
    }

    private static void execStatement(String query) {

        try (Connection connection = getDataSource().getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                //System.out.println(rs.getString(1));
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void execParametrizedStatement(String query, int id) {

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setInt(1, id);

            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(2));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
