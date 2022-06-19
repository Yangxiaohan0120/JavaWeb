package JSTL_EL;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/info")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String teacher = request.getParameter("teacher");
		Student stu = new Student();
		stu.setName("刘循子墨");
		stu.setMobile(null);
		String grade = "A";
		request.setAttribute("student", stu);
		request.setAttribute("grade", grade);

//		request.getRequestDispatcher("/info.jsp").forward(request, response);

		request.getRequestDispatcher("/el_info.jsp").forward(request, response);

//		request.setAttribute("grade", "B");
//		request.getServletContext().setAttribute("grade", "C");
//		HttpSession session = request.getSession();
//		session.setAttribute("student", stu);
//		session.setAttribute("grade", grade);
//		List list = new ArrayList();
//		list.add("A");
//		list.add("B");
//		list.add("C");
//
//		session.setAttribute("list",list);
//
	}

}
