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
public class DeleteHotelControllerMVC {
	@Autowired
	ServicesJPA service;
	@RequestMapping(value="/deletehotelmvc", method=RequestMethod.GET)
	public ModelAndView getDeleteHotel(ModelAndView mv)
	{
		mv.setViewName("DeleteHotel");
		return mv;
		
	}
	@RequestMapping(value="/deletehotel", method=RequestMethod.POST)
	public void doDeleteHotel(HttpServletResponse resp,HttpServletRequest req ,ModelAndView mv, @RequestParam("hotel_id") String hotelid) throws ServletException,IOException {
		PrintWriter out=resp.getWriter();
	    boolean state=service.deleteHotel(hotelid);
	    if(state==true)
		{
			
			out.print("<h1>"+"Hotel deleted"+"</h1>");
		}else
		{
			out.print("<h1>"+"Hotel not deleted"+"</h1>");
		}
	}
}


