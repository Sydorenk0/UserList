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

static { try {
    Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}
}
    public BaseDao() {}


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/userlist", "root", "1234");
    }
}
