package PracticeProject1.validationOfuserName;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/loginpage")
public class login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		
		HttpSession session = request.getSession();
		
		if(name.equals("admin") && password.equals("1234")){
		session.setAttribute("userName",name);
		//after set name redirect to dashboard
		
		response.sendRedirect("dashboard");
		
		}
		else {
			out.println("<font color = 'red'>Invalid Credentials!!!</font>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
	}

}
