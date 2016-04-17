package com.kav.vote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kav on 17.04.2016.
 */
@WebServlet(name = "AddCandidateServlet")
public class AddCandidateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RootServlet.vs.addCandidate(new Candidate((String) request.getParameter("candidateName")));
        System.out.println("new candidate added" + (String) request.getParameter("candidateName"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(403, "authentication required");
    }
}
