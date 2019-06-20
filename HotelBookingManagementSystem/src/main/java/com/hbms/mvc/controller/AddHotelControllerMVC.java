package com.hbms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hbms.dto.Hotel;
import com.hbms.services.ServicesJPA;

@Controller
public class AddHotelControllerMVC {
	@Autowired
	ServicesJPA service;
	
	@RequestMapping(value="/addhotelmvc", method=RequestMethod.GET)
	public ModelAndView getHotelAdd(ModelAndView mv)
	{
		mv.setViewName("AddHotel");
		return mv;
		
	}
	
	@RequestMapping(value="/addhotel", method=RequestMethod.POST)
	public void doHotelAdd(HttpServletResponse resp,@RequestParam("hotelid") String hotelid ,@RequestParam("city") String city,@RequestParam("hotelname") String hotelname,@RequestParam("address") String address,
			@RequestParam("description") String description,@RequestParam("avgratepernight") double avgratepernight,@RequestParam("phoneno1") String phoneno1,@RequestParam("phoneno2") String phoneno2,@RequestParam("rating") String rating,@RequestParam("email") String email,@RequestParam("fax") String fax,Hotel hotel, ModelAndView mv) throws ServletException,IOException {
		
		PrintWriter out=resp.getWriter();
		hotel.setHotelid(hotelid);
		hotel.setCity(city);
		hotel.setHotelname(hotelname);
		hotel.setAddress(address);
		hotel.setDescription(description);
		hotel.setAvgratepernight(avgratepernight);
		hotel.setPhoneno1(phoneno1);
		hotel.setPhoneno2(phoneno2);
		hotel.setRating(rating);
		hotel.setEmail(email);
		hotel.setFax(fax);
       boolean state=service.addHotel(hotel);
		
		
		if(state==true)
		{
			
			out.print("<h1>"+"Hotel added"+"</h1>");
		}else
		{
			out.print("<h1>"+"Hotel not added"+"</h1>");
		}
		

	

}}

