package ua.anton.servlet;

import ua.anton.data.User;
import ua.anton.data.UserDatabase;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * Created by Alex on 06.07.2015.
 */
public class AddUserServlet extends HttpServlet {



//    public void doGet(HttpServletRequest request,
//                      HttpServletResponse response)
//            throws ServletException, IOException {
//
//        User u = new User();
//        u.login = request.getParameter("name");
//        u.firstName = request.getParameter("firstName");
//        u.lastName = request.getParameter("lastName");
//        u.middleName = request.getParameter("middleName");
//        u.age = new Integer(request.getParameter("age"));
//
//        UserDatabase.addUser(u);
//
//
//
//        String nextJSP = "/HelloWorld";
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
//        dispatcher.forward(request, response);
//    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

         int t;



            User u = new User();
        //u.id = Integer.valueOf(request.getParameter("id"));
        if ("".equals(request.getParameter("id"))){
            u.id = User.getNextId();}
        else {
            u.id = Integer.valueOf(request.getParameter("id"));
                    }
        u.login = request.getParameter("name");
        u.firstName = request.getParameter("firstName");
        u.email = request.getParameter("email");
       // u.lastName = request.getParameter("lastName");
       // u.middleName = request.getParameter("middleName");
       // u.age = new Integer(request.getParameter("age"));

        UserDatabase.addUser(u);
       // UserDatabase.addUser(u.getId, u);


//        String nextJSP = "/userList.jsp";
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
//        dispatcher.forward(request, response);
        response.sendRedirect("/user/list");
    }


}


