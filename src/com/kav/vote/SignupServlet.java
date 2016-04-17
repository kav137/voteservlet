package com.kav.vote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by kav on 16.04.2016.
 */
@WebServlet(name = "SignupServlet")
public class SignupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String name = request.getParameter("name");
        String pwd = request.getParameter("password");

        System.out.println("Attempt to sign up: login = " + login);
        User currUser = RootServlet.vs.FindUser(login);
        if (currUser == null && login != RootServlet.admin.getLogin()) {
            System.out.println("Didn't find this user in list. Adding new User instance to users");
            currUser = new User(name, login, pwd);
            RootServlet.vs.AddUser(currUser);
            request.setAttribute("user", currUser);
            request.getRequestDispatcher("/user").forward(request, response);
        } else {
            System.out.println("User with this login already exists. Redirecting to error page");
            request.setAttribute("errorMessage", "this login is already token");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
