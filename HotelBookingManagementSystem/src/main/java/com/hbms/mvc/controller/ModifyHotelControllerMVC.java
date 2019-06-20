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

import com.hbms.dto.Hotel;
import com.hbms.services.ServicesJPA;

@Controller
public class ModifyHotelControllerMVC {
	@Autowired
	ServicesJPA service;
	
	@RequestMapping(value="/modifyhotelmvc", method=RequestMethod.GET)
	public ModelAndView getHotelUpdate(ModelAndView mv)
	{
		mv.setViewName("ModifyHotel");
		return mv;

}
	
	
	@RequestMapping(value="/modifyhotel", method=RequestMethod.POST)
	public void doHotelUpdate(HttpServletResponse resp,@RequestParam("hotel_id") String hotelId ,@RequestParam("city") String City,@RequestParam("hotel_name") String hotelname,@RequestParam("address") String Address,
			@RequestParam("description") String Description,@RequestParam("avg_per_night") double avg,@RequestParam("phone_no1") String phoneno1,@RequestParam("phone_no2") String phoneno2,@RequestParam("rating") String rate,@RequestParam("email") String Email,@RequestParam("fax") String fax,Hotel hotel, ModelAndView mv) throws ServletException,IOException {
		{
			 PrintWriter out=resp.getWriter();
			 hotel.setHotelid(hotelId);
				hotel.setCity(City);
				hotel.setHotelname(hotelname);
				hotel.setAddress(Address);
				hotel.setDescription(Description);
				hotel.setAvgratepernight(avg);
				hotel.setPhoneno1(phoneno1);
				hotel.setPhoneno2(phoneno2);
				hotel.setRating(rate);
				hotel.setDescription(Description);
				hotel.setEmail(Email);
				hotel.setFax(fax);

	
			    boolean state=service.modifyHotel(hotel);
				
				
				if(state==true)
				{
					
					out.print("<h1>"+"Hotel updated"+"</h1>");
				}else
				{
					out.print("<h1>"+"Hotel not updated"+"</h1>");
				}
				

}}}

