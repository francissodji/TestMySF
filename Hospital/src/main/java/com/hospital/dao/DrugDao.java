package com.hospital.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.hospital.connection.DbConnect;

public class DrugDao {

	//Add Race
	public static boolean AddDrug(String thetileDrug, String theCodeDrug) throws Exception
	{
		
		boolean isAdded = false;
		
		DbConnect conn = new DbConnect();
		conn.establishConnection();
		
		Connection myConnection;
		
		try {
			myConnection = conn.Connec;
			
			String textSQL = "Insert into DRUG(TitleDrug, Drug_code) values('"+thetileDrug+"','"+theCodeDrug+"')";
			
			
			Statement myStatem = myConnection.createStatement();
			int addok = myStatem.executeUpdate(textSQL);
			
			if(addok > 0)
				isAdded = true;
			
			myStatem.close();
			myConnection.close();
				
		}catch(Exception e) {
			System.out.println("Impossible to add motif.");
		}
		
		return isAdded;
	}
}
