package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.FlightInformationDTO;
import com.airline.service.AirlineServiceImpl;

@Controller
public class FlightSearchController {
	@Autowired
	private AirlineServiceImpl airportService;
	
	@RequestMapping(value = "/searchflightm", method = RequestMethod.GET)
	public ModelAndView getlogin(ModelAndView mv) {
		mv.setViewName("FlightSearch");
		return mv;

	}
	
	@RequestMapping(value = "/searchflight",method = RequestMethod.POST) 
	public ModelAndView searchAirport(@RequestParam("flightNo") String flightNo) 
	{
	FlightInformationDTO response=null;
	response=airportService.searchFlight(flightNo);
	ModelAndView mv=new ModelAndView();
	if(response!=null) {	      	    
		mv.addObject("rs", response);
		mv.setViewName("FlightSearchResult");
	}
	else {	        
		return new ModelAndView("FlightSearch","message","Please Select a Flight Number"); 

    }
	return mv;
}

}
