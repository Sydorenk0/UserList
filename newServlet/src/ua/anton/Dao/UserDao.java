package ua.anton.Dao;

import ua.anton.data.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Alex on 04.08.2015.
 */
public interface UserDao {

    User getById(int id) throws SQLException;
    List<User> getAll() throws SQLException;
    void saveOrUpdate(User user) throws SQLException;
    void delete (User id) throws SQLException;


}
