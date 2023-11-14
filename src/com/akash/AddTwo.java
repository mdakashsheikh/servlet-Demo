package com.akash;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddTwo extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;
//        HttpSession session = req.getSession();
//        session.setAttribute("k", k);

        Cookie cookie = new Cookie("k", k + "");
        res.addCookie(cookie);

        res.sendRedirect("sq");  // URL Rewriting

//        req.setAttribute("k", k);
//
//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req, res);
    }
}
