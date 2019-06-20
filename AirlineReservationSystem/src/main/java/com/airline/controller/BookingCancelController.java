package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller
public class BookingCancelController {

			@Autowired
			private AirlineServiceImpl airportService;
			
			@RequestMapping(value = "/cancelbookingm", method = RequestMethod.GET)
			public ModelAndView getlogin(ModelAndView mv) {
				mv.setViewName("BookingCancel");
				return mv;

			}
			
			@RequestMapping(value = "/cancelbooking",method = RequestMethod.POST) 
			public ModelAndView deleteAirport(@RequestParam("bookingId") long bookingId) { 
				boolean response=false;
				if(bookingId!=0) { 
					response=airportService.cancelBooking(bookingId);
				}

				if(response) {	      	    
					return new ModelAndView("UserHomepage","message","Added"); 
				}
				else {	        
					return new ModelAndView("BookingCancel","message","Please Enter Correct Booking Id"); 

				}
		}
	}
