package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller
public class AirportUpdateController {

	@Autowired
	private AirlineServiceImpl airportService;
	
	@RequestMapping(value = "/updateairportm", method = RequestMethod.GET)
	public ModelAndView getlogin(ModelAndView mv) {
		mv.setViewName("AirportUpdate");
		return mv;

	}

	@RequestMapping(value = "/updateairport",method = RequestMethod.POST) 
	public ModelAndView updateAirport(@RequestParam("abbreviation") String abbreviation,
			@RequestParam("location") String location,
			@RequestParam("city") String city,
			@RequestParam("zipCode") int zipCode) { 
		boolean response=false;
		if(abbreviation!=null) { 
			response=airportService.updateAirport(abbreviation, location, city, zipCode);
		}

		if(response) {	      	    
			return new ModelAndView("AdminHomePage","message","Added"); 
		}
		else {	        
			return new ModelAndView("AirportUpdate","message","Please Enter a Valid Abbreviation"); 

		}
	}
}
