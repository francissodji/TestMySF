package com.hospital.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.hospital.models.*;

import com.hospital.connection.*;


public class PatientDao {
	
	//Add Patient
	public boolean AddPatient(String theSSN, String thefirst_name, String thelast_name, String thegender,
			String thephone_number, String theemail, String theaddress, int theIdRace) throws Exception
	{
		
		
		boolean isAdded = false;
		
		DbConnect conn = new DbConnect();
		conn.establishConnection();
		
		Connection myConnection;
		
		try {
			myConnection = conn.Connec;
			
			
			String textSQL = "Insert into PATIENT(SSN,first_name,last_name,gender,phone_number,email,address,IdRace) "
					+ "values('"+theSSN+"', '"+thefirst_name+"','"+thelast_name+
					"', '"+thegender+"', '"+thephone_number+"', '"+theemail+"', '"+theaddress+"', "+theIdRace+" )";
			
			
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
