package com.kav.vote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kav on 17.04.2016.
 */
@WebServlet(name = "GetResultServlet")
public class GetResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get results: ");
        ArrayList<String> out = new ArrayList<>();
        HashMap<String, Integer> res = RootServlet.vs.getResult();
        res.forEach((name, value) -> {
            System.out.println(name + " : " + value);
            out.add(name + " : " + value);
        });

        request.setAttribute("result", out);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
