package com.hbms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hbms.dto.BookingDetails;
import com.hbms.dto.Hotel;
import com.hbms.services.ServicesJPA;
@Controller
public class BookHotelControllerMVC {
	@Autowired
	ServicesJPA service;
	
	@RequestMapping(value="/bookhotelmvc", method=RequestMethod.GET)
	public ModelAndView getHotelBook(ModelAndView mv)
	{
		mv.setViewName("BookHotel");
		return mv;
		
	}
	
	@RequestMapping(value="/bookhotel", method=RequestMethod.POST)
	public void doHotelBook(HttpServletResponse resp,@RequestParam("bookingid") String bookingId ,@RequestParam("roomid") String roomid,@RequestParam("userid") String userid,@RequestParam("bookedfrom") String bookedfrom,
			@RequestParam("bookedto") String bookedto,@RequestParam("noofadults") double noofadults,@RequestParam("noofchildren") double noofchildren,@RequestParam("amount") double amount,BookingDetails booking, ModelAndView mv) throws ServletException,IOException {
		
		PrintWriter out=resp.getWriter();
		booking.setBookingid(bookingId);
		booking.setRoomid(roomid);
		booking.setUserid(userid);
		booking.setBookedfrom(bookedfrom);
		booking.setBookedto(bookedto);
		booking.setNoofadults(noofadults);
		booking.setNoofchildren(noofchildren);
		booking.setAmount(amount);
       boolean state=service.bookHotel(booking);
		
		
		if(state==true)
		{
			
			out.print("<h1>"+"Hotel Bookedh1>");
		}else
		{
			out.print("<h1>"+"Hotelnot Booked"+"</h1>");
		}
		

	

}}



