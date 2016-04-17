package com.kav.vote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kav on 16.04.2016.
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getAttribute("user");
        request.setAttribute("name", user.getName());

        request.getRequestDispatcher("user.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(403, "Authentication required");
//        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
