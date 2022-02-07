package Ph_2less_1.sessiontrackingwithcookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/dashboard1")
public class dashboard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        Cookie cookie = null;
    Cookie[] cookies = null;
    boolean found = false;
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    
    cookies = request.getCookies();
    if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
            cookie = cookies[i];
            if (cookie.getName().contentEquals("userid") && cookie.getValue() != null) {
                out.println("UserId read from cookie:" + cookie.getValue() + "<br>");
                found = true;
            }
         }
    }
    if (!found) {
        out.println("No UserId was found in cookie.<br>");
    }
    out.println("</body></html>");

}



}
