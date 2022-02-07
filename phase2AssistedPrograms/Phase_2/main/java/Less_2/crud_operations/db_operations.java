package Less_2.crud_operations;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/db_operations")
public class db_operations extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
        try {
                 PrintWriter out = response.getWriter();
                 out.println("<html><body>");
                 
                InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
                Properties props = new Properties();
                props.load(in);
                
                
                db_connection conn = new db_connection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
                Statement stmt = conn.getConnection().createStatement();
                stmt.executeUpdate("create database mydatabase");
                out.println("Created database: mydatabase<br>");
                stmt.executeUpdate("use mydatabase");
                out.println("Selected database: mydatabase<br>");
                //stmt.executeUpdate("drop database mydatabase");
                stmt.close();
               // out.println("Dropped database: mydatabase<br>");
                
                
                
                
                
                conn.closeConnection();
                
                
                out.println("</body></html>");
                conn.closeConnection();
                
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (SQLException e) {
                e.printStackTrace();
        }
}


}
