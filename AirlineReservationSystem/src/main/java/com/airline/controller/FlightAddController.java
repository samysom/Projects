package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.FlightInformationDTO;
import com.airline.service.AirlineServiceImpl;

@Controller	
public class FlightAddController {

		@Autowired
		private AirlineServiceImpl airportService;
		
		@RequestMapping(value = "/addflightm", method = RequestMethod.GET)
		public ModelAndView getlogin(ModelAndView mv) {
			mv.setViewName("FlightAdd");
			return mv;

		}
		
		@RequestMapping(value = "/addflight",method = RequestMethod.POST)  
		public ModelAndView addFlight(@ModelAttribute FlightInformationDTO flightDto) {   
			boolean resp=false;
			if(null!=flightDto.getAirline() && !flightDto.getAirline().isEmpty())
			{
				resp=airportService.addFlight(flightDto);
			}

			if(resp) {	      	    
				return new ModelAndView("AdminHomePage","message","Added"); 
			}
			else {	        
				return new ModelAndView("FlightAdd","message","Unable to Add the Flight, Please Enter Valid Flight Number"); 

			}
		}
	}
