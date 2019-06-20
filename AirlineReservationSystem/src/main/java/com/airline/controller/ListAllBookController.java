package com.airline.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.BookingInformationDTO;
import com.airline.dto.FlightInformationDTO;
import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImpl;

@Controller
public class ListAllBookController {

	@Autowired
	private AirlineServiceImpl airportService;

	@RequestMapping(value = "/listbookm", method = RequestMethod.GET)
	public ModelAndView getBooking(ModelAndView mv) {
		mv.setViewName("ListBookSearch");
		return mv;

	}
	@RequestMapping(value = "/listbookshow",method = RequestMethod.GET)
	public ModelAndView listBooking(String flightNo) {   
		List<BookingInformationDTO> userList =  airportService.listBookings();
		ModelAndView model = new ModelAndView("ListBookingResult");
		model.addObject("lists", userList);
		return model;
	}


}
