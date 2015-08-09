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

        Connection connection = null;
        Statement statement = null;
        User user = new User();

        try {
            connection = getConnection();
            statement = connection.createStatement();

            String sql = "SELECT * FROM userlist WHERE id = '" + id + "'";
            System.out.println("sql = " + sql);
            ResultSet resultSet = statement.executeQuery(sql);

            resultSet.next();
            user.setId(resultSet.getInt("id"));
            user.setLogin(resultSet.getString("login"));
            user.setFirstName(resultSet.getString("lastName"));
            user.setEmail(resultSet.getString("Email"));


        } catch (SQLException ex) {
            //hkjhkjh

        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if ("".equals(user.getId())) {
            return null;
        } else {
            return user;
        }
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
                user.setLogin(resultSet.getString("login"));
                user.setFirstName(resultSet.getString("lastName"));
                user.setEmail(resultSet.getString("Email"));


                result.add(user);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
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

            //if ("".equals(user.getId())) {
            if (user.getId() != 0) {
                String sql = "UPDATE  userlist SET  Login = '" + user.getLogin() + "', " +
                        "lastName = '" + user.getFirstName() + "', Email ='" + user.getEmail() + "' WHERE  id ='" + user.getId() + "'";
                System.out.println("sql = " + sql);
                statement.executeUpdate(sql);
            } else {

                String sql = "INSERT  INTO  userlist (Login, lastName, Email) VALUE ('" + user.getLogin() + "', '" + user.getFirstName() + "', '" + user.getEmail() + "')";
                System.out.println("sql = " + sql);
                statement.execute(sql);
            }


        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void delete(User id) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = getConnection();
            statement = connection.createStatement();

            statement.execute("DELETE FROM userlist WHERE  id = '" + id.getId() + "'");


        } catch (SQLException ex) {
            //todo

        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


