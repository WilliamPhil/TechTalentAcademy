import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	String driverName = "com.mysql.cj.jdbc.Driver"; //Database Driver
	String url = "jdbc:mysql://localhost:3306/tta"; //location of schema
	String password = "Wp193913?"; //mysql workbench password
	String user = "root"; //mysql workbecnch username
	
	public Connection connect() {
		
		Connection con = null;
		
		try
		{
			//1. load driver
			Class.forName(driverName);
			
			//2. Connection
			 con = DriverManager.getConnection(url, user, password);
			
		}
		catch(Exception ex){
			
			System.out.println("DB Error: " + ex);
			
		}
		
		return con;
	}

}
