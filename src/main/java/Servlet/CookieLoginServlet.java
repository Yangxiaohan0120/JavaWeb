package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author Chris Yang
 * created 2022-06-18 15:58
 **/

@WebServlet("/Cookie/login")
public class CookieLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("log in successful");
        Cookie cookie = new Cookie("user","admin");
        cookie.setMaxAge(60 * 60 * 24 * 7); // 七天内有效
        resp.addCookie(cookie);
        resp.getWriter().println("log in successful");
    }
}
