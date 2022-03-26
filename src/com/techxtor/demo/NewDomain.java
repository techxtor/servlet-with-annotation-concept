package com.techxtor.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/new-domain")
public class NewDomain extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String redirectMessage = null;

        Cookie cookies[] = req.getCookies();

        for (Cookie c : cookies) {
            if (c.getName().equals("message")) {
                redirectMessage = c.getValue();
            }
        }

        PrintWriter out = res.getWriter();
        out.println("Message from Origin is --> " + redirectMessage);
    }
}
