package com.hbms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hbms.dto.BookingDetails;
import com.hbms.service.ImplService;


@WebServlet("/bookhotel")
public class BookHotelController  extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		ImplService impl = new ImplService();
		PrintWriter out=resp.getWriter();

		String bookingid=req.getParameter("bookingid");
		String roomid=req.getParameter("roomid");
		String userid=req.getParameter("userid");
		String bookedfrom=req.getParameter("bookedfrom");
		String bookedto=req.getParameter("bookedto");

		int noOfAdults=Integer.parseInt(req.getParameter("noofadults"));

		int noOfChildren=Integer.parseInt(req.getParameter("noofchildren"));

		String amount=req.getParameter("amount");


		BookingDetails bookingDetails=new BookingDetails();

		bookingDetails.setBookingid(bookingid);
		bookingDetails.setRoomid(roomid);
		bookingDetails.setUserid(userid);
		bookingDetails.setBookedfrom(bookedfrom);
		bookingDetails.setBookedto(bookedto);
		bookingDetails.setNoofadults(noOfAdults);
		bookingDetails.setNoofchildren(noOfChildren);
		bookingDetails.setAmount(amount);


		boolean result=impl.bookHotel(bookingDetails);

		if(result)
		{
			out.println("Hotel booked successfully");
		}else
		{
			out.println("Something went wrong");
		}
	}

}

