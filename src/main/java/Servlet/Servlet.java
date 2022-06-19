package Servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Chris Yang
 * created 2022-06-17 01:03
 *
**/

public class Servlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String html = "<h1 style = 'color:red'>hi," + name + "!</h1><hr/>";
        PrintWriter out = resp.getWriter();
        out.println(html); // 将html发回浏览器
    }
}
