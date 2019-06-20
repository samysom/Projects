package com.airline.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.dto.FlightInformationDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/addflight")
public class FlightAddController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		
		String flightNo=req.getParameter("flightNo");
		String airline=req.getParameter("airline");
		
		String depCity=req.getParameter("depCity");
		String arrCity=req.getParameter("arrCity");
		
		Date depDate= Date.valueOf(req.getParameter("depDate"));
		Date arrDate= Date.valueOf(req.getParameter("arrDate"));
		
		int firstSeats=Integer.parseInt(req.getParameter("firstSeats"));
		int firstSeatFare=Integer.parseInt(req.getParameter("firstSeatFare"));
		int bussSeats=Integer.parseInt(req.getParameter("bussSeats"));
		int bussSeatsFare=Integer.parseInt(req.getParameter("bussSeatsFare"));

		FlightInformationDTO flightDTO= new FlightInformationDTO();

		flightDTO.setFlightNo(flightNo);
		flightDTO.setAirline(airline);
		flightDTO.setDepCity(depCity);
		flightDTO.setArrCity(arrCity);

		flightDTO.setDepDate(depDate);
		flightDTO.setArrDate(arrDate);
		
		flightDTO.setFirstSeats(firstSeats);
		flightDTO.setFirstSeatFare(firstSeatFare);
		flightDTO.setBussSeats(bussSeats);
		flightDTO.setBussSeatsFare(bussSeatsFare);
		
		AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
		boolean add = service.addFlight(flightDTO);
		if(add)
		{
			resp.sendRedirect("./AdminHomePage.jsp");
		}
		else
		{
			resp.sendRedirect("./AddFlight.jsp");

		}
	}
}
