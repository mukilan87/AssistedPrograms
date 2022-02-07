package Less_2.stored_procedures;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Servlet implementation class Product_Details
 */
@WebServlet("/list_Product_Details")
public class Product_Details extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/crud_config.properties");
           Properties props = new Properties();
           props.load(in);
           
           
           DB_Connection conn = new DB_Connection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           CallableStatement stmt = conn.getConnection().prepareCall("{call add_product(?, ?)}");
           stmt.setString(1, "new product");
           stmt.setBigDecimal(2, new BigDecimal(1900.50));
           stmt.executeUpdate();
           
           out.println("Stored procedure has been executed.<Br>");
           stmt.close();
           
           
           out.println("</body></html>");
           conn.closeConnection();
           
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
           e.printStackTrace();
   }
}

	}

