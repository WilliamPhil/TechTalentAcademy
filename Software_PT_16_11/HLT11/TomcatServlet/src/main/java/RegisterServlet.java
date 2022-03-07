

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			
			DBConnect db = new DBConnect();
			
			Connection con = db.connect();
			
			Statement stmt = con.createStatement();
			
			String sql = "insert into customer(uname, email, pass) values('"+uname+"', '"+email+"', '"+pass+"')";
			
			int row = stmt.executeUpdate(sql);
			
			System.out.println("Row count: " + row);
			
			if(row == 1) {
				
				response.sendRedirect("profile.html");
			
			}
			else
			{
				write.print("cannot save user, please check agaian!");
				RequestDispatcher dispatch = request.getRequestDispatcher("register.html");
				dispatch.include(request, response);
			}
				
					
			
			
		}
		catch(Exception e) {
			
			System.out.println("Registration error: " + e);
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
