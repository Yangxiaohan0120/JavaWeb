package JSTL_EL;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @author Chris Yang
 * created 2022-06-18 22:23
 **/

@WebServlet("/infosession")
public class StudentRangeServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String teacher = request.getParameter("teacher");
        Student stu = new Student();
        stu.setName("刘循子墨");
        stu.setMobile(null);
        String grade = "A";
        HttpSession session = request.getSession();
        session.setAttribute("student", stu);
        session.setAttribute("grade", grade);
        request.getRequestDispatcher("/session_info.jsp").forward(request, response);

    }
}
