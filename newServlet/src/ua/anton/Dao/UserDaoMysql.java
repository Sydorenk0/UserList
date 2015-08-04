package ua.anton.Dao;

import ua.anton.data.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

// Created by Alex on 04.08.2015.

public class UserDaoMysql extends BaseDao implements UserDao {


    public User getById(int id) {
        if (id != 0) {
            Connection connection = null;
            Statement statement = null;
            User user = new User();

            try {
                connection = getConnection();
                statement = connection.createStatement();


                ResultSet resultSet = statement.executeQuery("SELECT * FROM userlist WHERE id = id");

                user.setId(resultSet.getInt("id"));
                user.setLogin(resultSet.getString("username"));
                user.setFirstName(resultSet.getString("lastName"));
                user.setEmail(resultSet.getString("Email"));


            } catch (SQLException ex) {
                //hkjhkjh

            } finally {
                if (statement != null) {
                    statement.close();
                    //  почему подчеркивает
                }
                if (connection != null) {
                    connection.close();
                    //  почему подчеркивает
                }
            }
            return user;
        }
//else {
// дописать вывод сообщения об ошибке
        // }
        return null;
    }

    public List<User> getAll() {
        Connection connection = null;
        Statement statement = null;
        List<User> result = new LinkedList<User>();

        try {
            connection = getConnection();
            statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("SELECT * FROM userlist");


            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setLogin(resultSet.getString("username"));
                user.setFirstName(resultSet.getString("lastName"));
                user.setEmail(resultSet.getString("Email"));


                result.add(user);
            }

        } catch (SQLException ex) {
            //todo

        } finally {
            if (statement != null) {
                statement.close();
                //  почему подчеркивает

            }
            if (connection != null) {
                connection.close();
                //  почему подчеркивает

            }
        }
        return result;
    }


    public void saveOrUpdate(User user) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = getConnection();
            statement = connection.createStatement();

            if ("".equals(user.getId())) {

                statement.execute("INSERT  INTO userlist (Login, lastName, Email) " +
                        "VALUE (user.getLogin,  user.getFirstName, user.getEmail);");
            } else {
                statement.executeUpdate("UPDATE  userlist SET  Login = user.getLogin, " +
                        "lastName = user.getFirstName, Email =user.getEmail WHERE  id =user.getId()");
            }


        } catch (SQLException ex) {
            //todo

        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }


        }

    }

    public void delete(User id) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = getConnection();
            statement = connection.createStatement();

            statement.execute("DELETE FROM userlist WHERE  id = id");


        } catch (SQLException ex) {
            //todo

        } finally {
            if (statement != null) {
                statement.close();
                //  почему подчеркивает
            }
            if (connection != null) {
                connection.close();
                //  почему подчеркивает
            }
        }
    }
}


