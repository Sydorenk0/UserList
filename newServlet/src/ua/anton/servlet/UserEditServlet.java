package ua.anton.servlet;

import ua.anton.Dao.UserDaoMysql;
import ua.anton.data.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Alex on 06.07.2015.
 */
public class UserEditServlet extends HttpServlet {

    //UserDatabase user = new UserDatabase();
    public UserDaoMysql userDao = new UserDaoMysql();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //user = UserDatabase.get(Integer.valueOf(request.getParameter("id")));

        User user = userDao.getById(Integer.valueOf(request.getParameter("id")));

        if (user.getId() != 0) {
            request.setAttribute("user", user);


            String nextJSP = "/addUser.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("/user/list");
        }
    }
}