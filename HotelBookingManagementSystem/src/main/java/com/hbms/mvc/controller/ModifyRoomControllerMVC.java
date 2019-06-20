package com.hbms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hbms.dao.ImplJPA;
import com.hbms.dto.RoomDetails;
import com.hbms.services.ServicesJPA;

@Controller
public class ModifyRoomControllerMVC
{
	@Autowired
	ServicesJPA service;
	
	@RequestMapping(value="/modifyroommvc", method=RequestMethod.GET)
	public ModelAndView getHotelAdd(ModelAndView mv)
	{
		mv.setViewName("ModifyRoom");
		return mv;
		
	}
	
	@RequestMapping(value="/modifyroom", method=RequestMethod.POST)
	public void doHotelAdd(HttpServletResponse resp,@RequestParam("hotelid") String hotelid ,@RequestParam("roomid") String roomid,@RequestParam("roomno") String roomno,@RequestParam("roomtype") String roomtype,@RequestParam("pernightrate") double rate,
			@RequestParam("availability") String availability,RoomDetails roomdetails, ModelAndView mv) throws ServletException,IOException {
		
		PrintWriter out=resp.getWriter();
		roomdetails.setHotelid(hotelid);
		roomdetails.setRoomid(roomid);
		roomdetails.setRoomno(roomno);
		roomdetails.setRoomtype(roomtype);
		roomdetails.setPernightrate(rate);
		roomdetails.setAvailability(availability);
		
		boolean state=service.modifyRoom(roomdetails);
		
		
		if(state==true)
		{
			
			out.print("<h1>"+"Room added"+"</h1>");
		}else
		{
			out.print("<h1>"+"Room not added"+"</h1>");
		}
		
}
    
}
