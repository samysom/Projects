package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/deleteairport")
public class AirportDeleteController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");

		String abbreviation = req.getParameter("abbreviation");
		
		AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
		boolean delete = service.deleteAirport(abbreviation);

		if(delete)
		{
			resp.sendRedirect("./AdminHomePage.jsp");
		}
		else
		{
			resp.sendRedirect("./DeleteAirport.jsp");
		}
	}
}
