package com.hbms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hbms.dto.Hotel;
import com.hbms.dto.RoomDetails;
import com.hbms.services.ServicesJPA;
import com.mysql.cj.jdbc.Blob;
@Controller
public class AddRoomControllerMVC {
	@Autowired
	ServicesJPA service;
	
	@RequestMapping(value="/addroommvc", method=RequestMethod.GET)
	public ModelAndView getHotelAdd(ModelAndView mv)
	{
		mv.setViewName("AddRoom");
		return mv;
		
	}
	
	@RequestMapping(value="/addroom", method=RequestMethod.POST)
	public void doHotelAdd(HttpServletResponse resp,@RequestParam("hotel_id") String hotelId ,@RequestParam("room_id") String roomid,@RequestParam("room_no") String roomno,@RequestParam("room_type") String roomtype,@RequestParam("per_night_rate") double rate,
			@RequestParam("file") MultipartFile file,@RequestParam("availability") String availability,RoomDetails roomdetails, ModelAndView mv) throws ServletException,IOException {
		
		PrintWriter out=resp.getWriter();
		roomdetails.setHotelid(hotelId);
		roomdetails.setRoomid(roomid);
		roomdetails.setRoomno(roomno);
		roomdetails.setRoomtype(roomtype);
		roomdetails.setPernightrate(rate);
		roomdetails.setAvailability(availability);
		
		boolean state=service.addRoom(roomdetails);
		
		
		if(state==true)
		{
			
			out.print("<h1>"+"Room added"+"</h1>");
		}else
		{
			out.print("<h1>"+"Room not added"+"</h1>");
		}
		
}
	}

