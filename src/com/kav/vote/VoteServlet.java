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
@WebServlet(name = "VoteServlet")
public class VoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (!RootServlet.vs.FindUser(request.getParameter("login")).isVoted()) {
            Candidate cand = RootServlet.vs.getVoting().getCandidate(request.getParameter("candidate"));
            cand.voteFor();
            System.out.println("voted for : " + cand.getName());
            RootServlet.vs.FindUser(request.getParameter("login")).vote();
        } else {
            request.setAttribute("message", "Your voice hasn't been accepted 'cause you've already voted");
        }
        request.getRequestDispatcher("/getResult").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
