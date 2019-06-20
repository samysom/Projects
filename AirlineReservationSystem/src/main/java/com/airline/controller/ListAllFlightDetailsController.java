package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.FlightInformationDTO;
import com.airline.service.AirlineServiceImpl;

@Controller
public class ListAllFlightDetailsController {
	
		@Autowired
		private AirlineServiceImpl airportService;

		@RequestMapping(value = "/listflights",method = RequestMethod.GET)
		public ModelAndView listUsers() {   
			List<FlightInformationDTO> flightList =  airportService.listFlights();
			ModelAndView model = new ModelAndView("ListAllFlights");
			model.addObject("lists", flightList);
			return model;
		}
}
