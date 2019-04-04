package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
	            String usernam = request.getParameter("usernam");
	            String password = request.getParameter("password");
	            String dbName = null;
	            String dbPassword = null;
	            String sql = "select * from registeration where usernam = ? and password = ?";
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/portal", "root", "");
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1,usernam);
	            ps.setString(2,password);
	            ResultSet rs = ps.executeQuery();
	            PrintWriter out = response.getWriter();
	            while(rs.next()){
	            	dbName = rs.getString(2);
	            	dbPassword = rs.getString("password");
	            	if(usernam.equals(dbName) && password.equals(dbPassword)) {
	            		out.println("You have successfully logged in!");
	            		out.println("Age:"+rs.getString(3)+"Gender:"+rs.getString(4)+"Event:"+rs.getString(5));
	            	}
	            	else {
	            		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	            		rd.include(request, response);
	            	}
	            	
	            }

	        } 
	        catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } 
	        catch (SQLException e) {
	            e.printStackTrace();
	            
	        }
	}

}
