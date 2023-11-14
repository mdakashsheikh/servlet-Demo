package com.akash;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//        HttpSession session = req.getSession();
//        int k = (int) session.getAttribute("k");
//        k = k * k;
        int k = 0;

        Cookie cookies[] = req.getCookies();

        for (Cookie c: cookies) {
            if (c.getName().equals("k")) {
                k = Integer.parseInt(c.getValue());
            }
        }
        k *= k;
        PrintWriter out = res.getWriter();
        out.println("Result is -- " + k );

        System.out.println("Sq Called");
    }
}
