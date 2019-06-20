package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.AirportDTO;
import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImpl;

@Controller
public class AirportSearchController {

		@Autowired
		private AirlineServiceImpl airportService;
		
		@RequestMapping(value = "/searchairportm", method = RequestMethod.GET)
		public ModelAndView getlogin(ModelAndView mv) {
			mv.setViewName("AirportSearch");
			return mv;

		}
		
		@RequestMapping(value = "/searchairport",method = RequestMethod.POST) 
		public ModelAndView searchAirport(@RequestParam("abbreviation") String abbreviation) 
		{
		AirportDTO response=null;
		response=airportService.searchAirport(abbreviation);
		ModelAndView mv=new ModelAndView();
		if(response!=null) {	      	    
			mv.addObject("rs", response);
			mv.setViewName("AirportSearchResult");
		}
		else {	        
			return new ModelAndView("AirportSearch","message","Please Enter a Valid Abbreviation"); 

	    }
		return mv;
		
	}
}
