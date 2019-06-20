package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller
public class BookingUpdateController {

		@Autowired
		private AirlineServiceImpl airportService;
		
		@RequestMapping(value = "/updatebookingm", method = RequestMethod.GET)
		public ModelAndView getlogin(ModelAndView mv) {
			mv.setViewName("BookingUpdate");
			return mv;

		}

		@RequestMapping(value = "/updatebooking",method = RequestMethod.POST) 
		public ModelAndView updateBooking(@RequestParam("bookingId") long bookingId,
				@RequestParam("classType") String classType,
				@RequestParam("srcCity") String srcCity,
				@RequestParam("destCity") String destCity) { 
			boolean response=false;
			if(bookingId!=0) { 
				response=airportService.updateBooking(bookingId, classType, srcCity, destCity);
			}

			if(response) {	      	    
				return new ModelAndView("UserHomepage","message","Added"); 
			}
			else {	        
				return new ModelAndView("BookingUpdate","message","Please Enter Correct BookingId"); 

			}
		}
	}
