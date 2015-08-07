package ua.anton.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Alex on 06.08.2015.
 */
public class JDBCTest {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Загружаем драйвер
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlist", "root", "1234");
            System.out.println("connection = " + connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
