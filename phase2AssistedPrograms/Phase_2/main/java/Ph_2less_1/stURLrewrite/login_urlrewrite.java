package Ph_2less_1.stURLrewrite;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class login_urlrewrite
 */
@WebServlet("/login_urlwrite")
public class login_urlrewrite extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String userId = request.getParameter("userid");
        response.sendRedirect("dashboard2?userid=" + userId);  
	 }

}
