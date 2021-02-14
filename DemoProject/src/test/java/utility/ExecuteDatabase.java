package utility;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteDatabase {
	Connection con= null;
	Statement stmt = null;
	
	public void dbConnection(String url,String username,String userpwd) throws ClassNotFoundException {
		
		Class.forName("org.postgresql.Driver");
		
		// Connection to DB
			try {
				con = DriverManager.getConnection(url,username, userpwd);
				
				System.out.println("Connection is successfull: "+con.toString());
			} catch(SQLException e)
			{
				System.out.println("Connection is NOT successfull: "+" Exception Message: "+e);
			}
	}
	
	
	public void createStatement() throws SQLException 
	{
		stmt = con.createStatement();	
	}
	
	public void closeStatement() throws SQLException 
	{
		stmt.close();
	}
	
	
	public void closeConnection() throws SQLException 
	{
		con.close();
	}
	
	
	public void runQuery(String sqlQuery) throws SQLException {
			
			if(sqlQuery.contains("Select"))
			{
			
			// Verify the Query results			
			ResultSet res = stmt.executeQuery(sqlQuery);
		
			while(res.next()== true) {
				int id = res.getInt("EmpID");
				String lastname = res.getString("LastName");
				String fisrtname = res.getString("FirstName");
				String city = res.getString("City");
				
				System.out.println("UserId = "+id);
				System.out.println("Last Name = "+lastname);
				System.out.println("First Name = "+fisrtname);	
				System.out.println("City Name = "+city);
				System.out.println("Newrow data ---------------------------");	
			}
			res.close();
			}
			else {
				
				// Execute Query
				try {
				stmt.executeQuery(sqlQuery);
				}catch(SQLException e) {
					System.out.println(e.getStackTrace());
				}
			}
		}
}
