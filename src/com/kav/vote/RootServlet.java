package com.kav.vote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by kav on 16.04.2016.
 */
@WebServlet(name = "RootServlet")
public class RootServlet extends HttpServlet {
    public static VotingSystem vs;
    public static User admin;
    public static String message = "trial";

    //    @Override
    public void init() throws ServletException {
        super.init();
        vs = new VotingSystem();
        admin = new Admin("admin", "admin", "xdd");
        System.out.println("app started");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("/index session : " + session.getId());
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
