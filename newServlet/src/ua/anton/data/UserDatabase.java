package ua.anton.data;

import java.util.HashMap;

/**
 * Created by Alex on 06.07.2015.
 */
public class UserDatabase {


    static HashMap<Integer, User> userList = new HashMap<Integer, User>();

    public static void addUser(User u) {
        userList.put(u.getId(), u);
    }

    public static void delete(int id) {
        userList.remove(id);
    }

    public static User get(int id) {
        User y = new User();
        y = userList.get(id);
        return y;
    }

    public static HashMap<Integer, User> getUsers() {
        return userList;
    }


}