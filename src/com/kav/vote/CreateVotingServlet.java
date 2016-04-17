package com.kav.vote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by kav on 17.04.2016.
 */
@WebServlet(name = "CreateVotingServlet")
public class CreateVotingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Voting voting = new Voting(request.getParameter("voteTitle"), new ArrayList<>());
        RootServlet.vs.setVoting(voting);
        System.out.println("created voting with title : " + request.getParameter("voteTitle"));
        System.out.println("Rediredcting to admin's page");

        request.setAttribute("successMessage", "Voting <" + request.getParameter("voteTitle") + "> has been successfully created");
        request.getRequestDispatcher("admin.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(403, "forbidden");
    }
}
