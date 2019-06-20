package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.dto.BookingInformationDTO;
import com.airline.service.AirlineServiceImplJDBC;

public class BookingController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		
//		BookingInformationDTO bookingInformationDTO = new BookingInformationDTO();
//		// bookingDetailsDTO.setBoookedFrom(bookedFrom);
//		// bookingDetailsDTO.setBookedTo(bookedTo);
//		
//		bookingInformationDTO.setNoOfAdults();
//		bookingInformationDTO.setNoOfChildren(noOfChildren);
//		
//		Service service = new Service();
//		boolean result= service.booking(bookingDetailsDTO);
//
//		if(result)
//		{
//			System.out.println("Success");
//		}else
//		{
//
//			System.out.println("Wrong");
//		}
	}
}
