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
			//1. load driver
			Class.forName(driverName);
			
			//2. Connection
			Connection con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.println("DB Connection Success");
			}
			else	
			{
				System.out.println("DB Connection Failed");
			}
			
			//3.Create Statement
			Statement stmt = con.createStatement();
			
			//4 Execute sql query
			int row_count = stmt.executeUpdate("insert into student(sid, sname, sub, score) values(03, 'Alex', 'JDBC', 10)");
			System.out.println("Row Count: " + row_count);
				
			
		}
		catch(Exception ex) {
			System.out.println("DB Error: " + ex);
		}
		
		
	}

}
