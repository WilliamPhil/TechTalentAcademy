//JDBC API

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBConnect {

	public static void main(String[] args) {
		
		String driverName = "com.mysql.cj.jdbc.Driver"; //Database Driver
		String url = "jdbc:mysql://localhost:3306/university"; //location of schema
		String password = "Wp193913?"; //mysql workbench password
		String user = "root"; //mysql workbecnch username
		
		try {
			
			//Load Driver 
			Class.forName(driverName);
			
			//Connection
			Connection con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.println("DB Connection Success");
			}
			else	
			{
				System.out.println("DB Connection Failed");
			}
			
			//Create statement
			Statement stmt = con.createStatement();
			
			
			  int row_count = stmt.
			  executeUpdate("insert into employee(eid, ename, email, mobile, designation, salary) values(4, 'james', 'james@aol.com', '987654', 'Software Eng.', 25000.00),"
			  + "(5, 'Alice', 'alice@aol.com', '4567890', 'UI/UX', 21000)"); 
			  System.out.println("Row Count: " + row_count);
			 			
			//Query to get number of rows in the employee table
			String query = "select count(*) from employee";
			
			//Execute query
			ResultSet rs = stmt.executeQuery(query);
			
			//Retrieving the result
			rs.next();
			
			int count = rs.getInt(1);
			
			System.out.println("Number of records in employee table: " + count);
		
			
		

	}catch(Exception ex) {
		
		System.out.println("DB Error: " + ex);
	}
		
	}

}
