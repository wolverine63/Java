package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Registeration")
public class Registeration extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public Registeration(){
        super();
    }
    
 

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try {
            String usernam = request.getParameter("usernam");
            String password = request.getParameter("password");
            String age = request.getParameter("age");
            String gender = request.getParameter("gender");
            String event = request.getParameter("event");
            String sql = "insert into registeration(usernam,password,age,gender,event) values(?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/portal", "root", "");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,usernam);
            ps.setString(2,password);
            ps.setString(3,age);
            ps.setString(4,gender);
            ps.setString(5,event);
            ps.executeUpdate();
            PrintWriter out = response.getWriter();
            out.println("You have successfully registered!");
            out.flush();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        catch (SQLException e) {
            e.printStackTrace();
            
        }
    }

}

