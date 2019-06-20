package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller	
public class FlightDeleteController {

		@Autowired
		private AirlineServiceImpl airportService;
		
		@RequestMapping(value = "/deleteflightm", method = RequestMethod.GET)
		public ModelAndView getlogin(ModelAndView mv) {
			mv.setViewName("FlightDelete");
			return mv;

		}
		
		@RequestMapping(value = "/deleteflight",method = RequestMethod.POST) 
		public ModelAndView deleteAirport(@RequestParam("flightNo") String flightNo) { 
			boolean response=false;
			if(flightNo!=null) { 
				response=airportService.deleteFlight(flightNo);
			}

			if(response) {	      	    
				return new ModelAndView("AdminHomePage","message","Added"); 
			}
			else {	        
				return new ModelAndView("FlightDelete","message","Please Enter a Valid Flight Number "); 

			}
	}
}
