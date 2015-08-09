package ua.anton.Test;

import ua.anton.Dao.UserDaoMysql;

/**
 * Created by Alex on 06.08.2015.
 */
public class TestDao {
    public static void main(String[] args) {
        UserDaoMysql userTest = new UserDaoMysql();
        userTest.getAll();
    }
}
