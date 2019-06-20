package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller	
public class AirportDeleteController {

	@Autowired
	private AirlineServiceImpl airportService;
	
	@RequestMapping(value = "/deleteairportm", method = RequestMethod.GET)
	public ModelAndView getlogin(ModelAndView mv) {
		mv.setViewName("AirportDelete");
		return mv;

	}
	
	@RequestMapping(value = "/deleteairport",method = RequestMethod.POST) 
	public ModelAndView deleteAirport(@RequestParam("abbreviation") String abbreviation) { 
		boolean response=false;
		if(abbreviation!=null) { 
			response=airportService.deleteAirport(abbreviation);
		}

		if(response) {	      	    
			return new ModelAndView("AdminHomePage","message","Added"); 
		}
		else {	        
			return new ModelAndView("AirportDelete","message","Please Enter a Valid Abbreviation"); 

		}
}
}
