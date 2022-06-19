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
 * created 2022-06-18 16:03
 **/

@WebServlet("/Cookie/Index")
public class CookieIndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cs = req.getCookies();
        if(cs == null){
            System.out.println("user not login");
            return;
        }
        for (Cookie cookie : cs) {
            System.out.println(cookie.getName() + ": " + cookie.getValue());
        }
    }
}
