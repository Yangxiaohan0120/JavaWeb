package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pattern/*")
public class PatternServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = request.getRequestURL().toString();
		System.out.println(url);
		String id = url.substring(url.lastIndexOf("/") + 1);
		int eid =  Integer.parseInt(id);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(id);
		if(eid == 1) {
			out.println("铁柱");
		}else if(eid == 2) {
			out.println("李牛");
		}else {
			out.println("小布丁");
		}
		
	}
	
}
