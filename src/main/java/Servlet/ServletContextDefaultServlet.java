package Servlet;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextDefaultServlet
 */
@WebServlet("/servletcontext/default")
public class ServletContextDefaultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextDefaultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = (ServletContext)request.getServletContext();
		String copyright = (String)context.getAttribute("copyright");
		String title = (String)context.getAttribute("title");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("<h1>" + title + "</h1>" + copyright);
	}

}
