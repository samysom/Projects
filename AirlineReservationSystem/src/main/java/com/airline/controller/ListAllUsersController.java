package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImpl;

@Controller	
public class ListAllUsersController {

	@Autowired
	private AirlineServiceImpl airportService;

	@RequestMapping(value = "/listusers",method = RequestMethod.GET)
	public ModelAndView listUsers() {   
		List<UsersDTO> userList =  airportService.listUsers();
		ModelAndView model = new ModelAndView("ListAllUsers");
		model.addObject("lists", userList);
		return model;
	}
}
