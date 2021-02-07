package com.hospital.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnect {
	
	public Connection Connec;
	 
	public void establishConnection() throws Exception
	{
		try 
	    {
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	   
	    	String url = "jdbc:sqlserver://AKWABAPCFRANCIS\\SQLEXPRESS:1433;database=HOSPITAL;user=sa;password=@Sodj81fran;encrypt=true;";
	    	
	    	Connec = DriverManager.getConnection(url);
			

	    }
	    // Handle any errors that may have occurred.
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
