package com.hbms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hbms.dto.Hotel;
import com.hbms.services.ServicesJPA;
@Controller
public class ListHotelControllerMVC {
	@Autowired
	ServicesJPA service;
	
	@RequestMapping(value="/listhotelmvc", method=RequestMethod.POST)
	public void listAllApplications(HttpServletResponse resp,ModelAndView mv) throws IOException
	{
		PrintWriter out=resp.getWriter();
		 List<Hotel> li=service.listHotels();
		  if(li!=null)
	 		{
	        	 
	        	 out.print("<h1>"+"all hotel  details"+"</h1>");
	 			out.print(li);
	 		}
	 		else
	 		{
	 			out.print("<h1>"+"something went wrong"+"</h1>");
	 		}
	}

}
