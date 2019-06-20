package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.dto.AirportDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/updateairport")
public class AirportUpdateController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		String airportName = req.getParameter("airportName");
		String abbreviation = req.getParameter("Abbreviation");
		String location = req.getParameter("location");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		int zipCode = Integer.parseInt( req.getParameter("zipCode"));
		
		AirportDTO airportDTO = new AirportDTO();

		airportDTO.setAirportName(airportName);
		airportDTO.setAbbreviation(abbreviation);
		airportDTO.setLocation(location);
		airportDTO.setCity(city);
        airportDTO.setState(state);
        airportDTO.setZipCode(zipCode);
        
        AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
		boolean update = service.updateAirport(airportDTO);
		
		if(update)
		{
			resp.sendRedirect("./AdminHomePage.jsp");
		}
		else
		{
			resp.sendRedirect("./UpdateAirport.jsp");
		}
	}
}
