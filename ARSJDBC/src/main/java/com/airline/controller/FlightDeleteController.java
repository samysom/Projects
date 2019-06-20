package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/deleteflight")
public class FlightDeleteController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");

		String flightNo = req.getParameter("flightNo");

		AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
		boolean delete= service.deleteFlight(flightNo);
		if(delete)
		{
			resp.sendRedirect("./AdminHomePage.jsp");
		}
		else
		{
			resp.sendRedirect("./DeleteFlight.jsp");
		}
	}
}
