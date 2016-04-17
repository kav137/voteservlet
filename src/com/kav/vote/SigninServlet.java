package com.kav.vote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kav on 16.04.2016.
 */
@WebServlet(name = "SigninServlet")
public class SigninServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String pwd = request.getParameter("password");
        System.out.println("Attempt to sign in: login = " + login);

        //admin
        if (login.equals(RootServlet.admin.getLogin())) {
            if (RootServlet.admin.signUp(login, pwd)) {
                System.out.println("Rediredcting to admin's page");
                request.getRequestDispatcher("admin.jsp").forward(request, response);
            } else {
                request.setAttribute("errorMessage", "wrong credentials provided");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }

        //regular user
        Elector currUser = RootServlet.vs.FindUser(login);
        if (currUser == null) {
            request.setAttribute("errorMessage", "wrong credentials provided");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else {
            System.out.println("Successfully logged in. Redirecting to user's page");
            request.setAttribute("elector", currUser);
            request.getRequestDispatcher("user").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
