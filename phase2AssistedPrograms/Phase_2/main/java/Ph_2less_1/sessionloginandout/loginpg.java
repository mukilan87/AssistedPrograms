package Ph_2less_1.sessionloginandout;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/loginpg")
public class loginpg extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userid");
        HttpSession session=request.getSession();  
    session.setAttribute("userid",  userId);
                 
    response.sendRedirect("dashboardpg");  
       

	}
}
