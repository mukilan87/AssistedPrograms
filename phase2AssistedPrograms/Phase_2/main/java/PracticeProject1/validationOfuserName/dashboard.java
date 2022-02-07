package PracticeProject1.validationOfuserName;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/dashboard")
public class dashboard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("userName") !=null) {
			
			out.println("Welcome " + session.getAttribute("userName"));
			out.println("<br> You are now Logged in...<br>");
			out.println("<form action = 'logout'> "
					+ "<input type = 'submit' value = 'logout'>"
					+ " </form>");
		}
		else {
			response.sendRedirect("index.html");
		}
	}

}
