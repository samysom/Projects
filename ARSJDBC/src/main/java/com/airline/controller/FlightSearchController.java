package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.dto.FlightInformationDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/flightSearch")
public class FlightSearchController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");

		String flightNo= req.getParameter("flightNo");

		AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
		FlightInformationDTO search = service.searchFlight(flightNo);
		
		HttpSession session = req.getSession(false);

		if(session!=null)
		{
			if(search!=null)
			{
				session.setAttribute("flight",search);
				resp.sendRedirect("./ShowFlight.jsp");
			}
			else
			{
				resp.sendRedirect("./FlightSearch.jsp");
			}
		}
	}
}
