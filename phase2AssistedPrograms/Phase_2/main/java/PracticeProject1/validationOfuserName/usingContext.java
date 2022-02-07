package PracticeProject1.validationOfuserName;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet ("/usingContext")
public class usingContext extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		
		ServletContext context = request.getServletContext();
	    if(userName != null) {
	    	session.setAttribute("userName", userName );
	    	context.setAttribute("userName", userName);
	    	
	    }
	    
	    out.println("From request, username :" + userName + "<br>");
	    out.println("From request, session :" + session.getAttribute("userName")+ "<br>" );
	    out.println("From request, context :" + context.getAttribute("userName") + "<br>");
	    
	}

}
