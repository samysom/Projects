package com.hbms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hbms.services.ServicesJPA;
@Controller
public class DeleteRoomControllerMVC {
	@Autowired
	ServicesJPA service;
	@RequestMapping(value="/deleteroommvc", method=RequestMethod.GET)
	public ModelAndView getDeleteRoom(ModelAndView mv)
	{
		mv.setViewName("DeleteRoom");
		return mv;
		
	}
	@RequestMapping(value="/deleteroom", method=RequestMethod.POST)
	public void doDeleteRoom(HttpServletResponse resp,HttpServletRequest req ,ModelAndView mv, @RequestParam("room_id") String roomid) throws ServletException,IOException {
		PrintWriter out=resp.getWriter();
	    boolean state=service.deleteRoom(roomid);
	    if(state==true)
		{
			
			out.print("<h1>"+"Room deleted"+"</h1>");
		}else
		{
			out.print("<h1>"+"Room not deleted"+"</h1>");
		}
	
		
		
		
		
		
	}
	

}
