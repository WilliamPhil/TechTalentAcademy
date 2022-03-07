

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			PrintWriter write = response.getWriter();
			response.setContentType("text/html");
			
			String uname = request.getParameter("uname");	
			String pass = request.getParameter("pass");
			
			DBConnect db = new DBConnect();
			Connection con = db.connect();
			Statement stmt = con.createStatement();
			String sql = "select * from customer where uname='"+uname+"' and pass='"+pass+"'";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				response.sendRedirect("profile.html");
			}
			else
			{
				write.print("<center>Login Failed! <br/> Please enter a valid username or password!</center>");
			}
					
			
			
			
		}
		catch(Exception e) {
			System.out.println("error : " + e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
