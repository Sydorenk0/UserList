package ua.anton.servlet;

import ua.anton.Dao.UserDaoMysql;
import ua.anton.data.UserDatabase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//Created by Alex on 06.07.2015.

public class UserListServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //request.setAttribute("userList", UserDatabase.getUsers().values());

        request.setAttribute("userList", UserDaoMysql.getAll());
        //  требует чтобы класс был статик
        // что делать с итераторами  для отображения?

        String nextJSP = "/userList.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);


    }

}
