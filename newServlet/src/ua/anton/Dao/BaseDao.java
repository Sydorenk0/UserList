package ua.anton.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Alex on 04.08.2015.
 */
public class BaseDao {
    private  final String URL = "jdbc:mysql://localhost:3306/userlist";
    private  final String USERNAME = "root";
    private  final  String PASSWORD = "1234";

    private Connection connection = null;

    public BaseDao(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
