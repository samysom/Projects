package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.AirportDTO;
import com.airline.service.AirlineServiceImpl;

@Controller	
public class AirportAddController {

	@Autowired
	private AirlineServiceImpl airportService;
	
	@RequestMapping(value = "/addairportm", method = RequestMethod.GET)
	public ModelAndView getlogin(ModelAndView mv) {
		mv.setViewName("AirportAdd");
		return mv;

	}
	
	@RequestMapping(value = "/addairport",method = RequestMethod.POST)  
	public ModelAndView addAirport(@ModelAttribute AirportDTO airportDto) {   
		boolean resp=false;
		if(null!=airportDto.getAirportName() && !airportDto.getAirportName().isEmpty() && null!=airportDto.getAbbreviation() && !airportDto.getAbbreviation().isEmpty() && null!=airportDto.getLocation() && !airportDto.getLocation().isEmpty()) 
		{
			resp=airportService.addAirport(airportDto);
		}

		if(resp) {	      	    
			return new ModelAndView("AdminHomePage","creationmessage","Airport Added Successfully"); 
		}
		else {	        
			return new ModelAndView("AirportAdd","message","Unable to Add Airport, Please Check the Abbreviation"); 

		}
	}
}
