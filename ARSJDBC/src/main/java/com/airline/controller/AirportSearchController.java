package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.dto.AirportDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/searchAirport")
public class AirportSearchController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		
		String abbreviation = req.getParameter("abbreviation");

		AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
		AirportDTO search = service.searchAirport(abbreviation);

		HttpSession session = req.getSession(false);

		if(session!=null)
		{
			if(search!=null)
			{
				session.setAttribute("airport",search);
				resp.sendRedirect("./ShowAirport.jsp");
			}
			else
			{
				resp.sendRedirect("./AirportSearch.jsp");
			}
		}
	}
}

