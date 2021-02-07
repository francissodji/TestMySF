package com.hospital.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import com.hospital.dao.*;
import com.hospital.models.*;

/**
 * Servlet implementation class GetRaceController
 */
public class GetRaceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read the command parameter
		String theCommand = request.getParameter("command");
		
		//if the command is missing, then default to listing students
		if (theCommand == null)
		{
			theCommand = "LIST";
		}
		
		switch (theCommand)
		{
		
			case "ADD":
				AddRace(request,response);
				break;
			
			
			case "LIST":
			try {
				ListRace(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
				
				
			default:
			try {
				ListRace(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	private void ListRace(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}


	//AddRace Method
	private void AddRace(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		RaceDao myDaoRace = new RaceDao();
		
		boolean isAdded = false;
		
		
		//Read data from the view
		String discTitle = request.getParameter("RaceTitle");

		
		//Add Discount to the database
		try {
			//Pass the data to the Add method
			isAdded = RaceDao.AddRace(discTitle);
			
			if(isAdded == true)
			{
				RequestDispatcher reqDispach = request.getRequestDispatcher("SuccessAction.jsp");
				reqDispach.forward(request, response);
			}
			else //not success
			{
				RequestDispatcher reqDispach = request.getRequestDispatcher("SuccessAction.jsp");
				reqDispach.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
