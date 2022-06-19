package JSTL_EL;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class JstlServlet
 */
@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JstlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("score", 58);
		request.setAttribute("grade", "E");
//		List list = new ArrayList();
//		list.add(new Company("腾讯" , "www.tencent.com"));
//		list.add(new Company("百度" , "www.baidu.com"));
//		list.add(new Company("慕课网" , "www.imooc.com"));
//		request.setAttribute("companys", list);
		request.getRequestDispatcher("/core.jsp").forward(request, response);
	}

}
