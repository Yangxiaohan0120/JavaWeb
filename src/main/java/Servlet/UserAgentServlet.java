package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author Chris Yang
 * created 2022-06-17 22:44
 **/

@WebServlet("/ua")
public class UserAgentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uerAgent = req.getHeader("User-Agent");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(uerAgent);
    }
}
