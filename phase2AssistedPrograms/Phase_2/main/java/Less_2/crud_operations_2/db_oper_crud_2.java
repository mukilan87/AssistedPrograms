package Less_2.crud_operations_2;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/list_crud_2")
public class db_oper_crud_2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/crud_2_config.properties");
           Properties props = new Properties();
           props.load(in);
           
           
           DB_connection conn = new DB_connection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           stmt.executeUpdate("insert into eproduct (name, price) values ('New Product', 17800.00)");
           out.println("Executed an insert operation<br>");
           
          // stmt.executeUpdate("update eproduct set price=2000 where name = 'New Product'");
          // out.println("Executed an update operation<br>");
           
          // stmt.executeUpdate("delete from eproduct where name = 'New Product'");
         //  out.println("Executed a delete operation<br>");
           
           stmt.close();
           
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

