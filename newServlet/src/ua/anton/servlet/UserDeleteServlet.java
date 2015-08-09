package ua.anton.servlet;

import ua.anton.Dao.UserDaoMysql;
import ua.anton.data.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Created by Alex on 21.07.2015.

public class UserDeleteServlet extends HttpServlet {

    public UserDaoMysql userDao = new UserDaoMysql();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //UserDatabase.delete(Integer.valueOf(request.getParameter("id")));

        User u = new User();
        u.id = Integer.valueOf(request.getParameter("id"));

        userDao.delete(u);

        response.sendRedirect("/user/list");
    }
}
