package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller
public class FlightUpdateController {
		@Autowired
		private AirlineServiceImpl airportService;
		
		@RequestMapping(value = "/updateflightm", method = RequestMethod.GET)
		public ModelAndView getlogin(ModelAndView mv) {
			mv.setViewName("FlightUpdate");
			return mv;

		}

		@RequestMapping(value = "/updateflight",method = RequestMethod.POST) 
		public ModelAndView updateAirport(@RequestParam("flightNo") String flightNo,
				@RequestParam("airline") String airline,
				@RequestParam("depDate") String depDate,
				@RequestParam("arrDate") String arrDate,
				@RequestParam("depTime") String depTime,
				@RequestParam("arrTime") String arrTime,
				@RequestParam("depCity") String depCity,
				@RequestParam("arrCity") String arrCity,
				@RequestParam("fare") double fare) { 
			
			boolean response=false;
			if(airline!=null) { 
				response=airportService.updateFlight(flightNo, airline, depDate, arrDate, depTime, arrTime, depCity, arrCity, fare);
			}

			if(response) {	      	    
				return new ModelAndView("FlightUpdate","creationmessage","Flight Detalis Updated Sucessfully"); 
			}
			else {	        
				return new ModelAndView("FlightUpdate","message","Unable to Update Flight Details, Please give Correct Flight Number"); 

			}
		}
	}