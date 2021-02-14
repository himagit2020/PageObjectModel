package testsuites;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import utility.ExecuteDatabase;
import utility.ReadInputData;

public class DBvalidationTestSuite {
	
	String url = "jdbc:postgresql://localhost:5432/employee";
	String user="postgres";
	String pwd="admin";
	

		
	// All Queries here 
	//String sqlQuery= "insert into emp values (104, 'Keesaru', 'Preeti', 'MSP');";
	String sqlQuery = "Select * from emp where empid='103';";
	
	@Test
	public void TestDB() throws SQLException, ClassNotFoundException, IOException {
		ReadInputData read = new ReadInputData();
		
		String inputdata = read.getData();
		//System.out.println(inputdata);
		
		// userid='100',LastName='xyz',FirstName='abc',City='USA'
		
		String[] res = inputdata.split("[,]", 0);
	       for(String myStr: res) {
	          System.out.println(myStr);
	       }

	       String ExpEmpID = res[0];
	       String ExpLastName= res[1];
	       String ExpFirstName= res[2];
	       String ExpCity= res[3];
	       
	       System.out.println("--------------------------------------------------");
	       System.out.println("Expect EmpID: "+ ExpEmpID);
	       System.out.println("Expect LastName: "+ ExpLastName);
	       System.out.println("Expect FirstName: "+ ExpFirstName);
	       System.out.println("Expect City: "+ ExpCity);
	       
	    		   
		
//		ExecuteDatabase edb = new ExecuteDatabase();
//		
//		edb.dbConnection(url, user, pwd);
//		
//		edb.createStatement();
//		
//		edb.runQuery(sqlQuery);
//		
//		edb.closeStatement();
//		
//		edb.closeConnection();
		
	}

}
