package Ph_2less_1.stURLrewrite;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/dashboard2")
public class dashboard2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
    out.println("<html><body>");
    
    String userId = request.getParameter("userid");
    if (userId == null ) {
        out.println("No UserId was found in the URL.<br>");
    } else {
        out.println("UserId obtained from URL Rewriting:" + userId + "<br>");
    }
    out.println("</body></html>");

}

}
