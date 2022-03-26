package com.techxtor.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/current-domain")
public class CurrentDomain extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        Cookie cookie = new Cookie("message", "hello-world");
        res.addCookie(cookie);

        res.sendRedirect("new-domain");
    }
}
