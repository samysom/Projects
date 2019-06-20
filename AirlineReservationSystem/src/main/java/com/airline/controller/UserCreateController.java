package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImpl;

@Controller	
public class UserCreateController {
	@Autowired
	private AirlineServiceImpl airportService;
	
	@RequestMapping(value = "/userm", method = RequestMethod.GET)
	public ModelAndView getlogin(ModelAndView mv) {
		mv.setViewName("UserCreate");
		return mv;

	}


	@RequestMapping(value = "/user",method = RequestMethod.POST)  
	public ModelAndView createUser(@ModelAttribute UsersDTO userDto) {
		boolean response=false;
		if(null!=userDto.getUserName()&& !userDto.getUserName().isEmpty() && null!=userDto.getPassword() && !userDto.getPassword().isEmpty()) 
		{
			response=airportService.createUser(userDto);
		}

		if(response) {	      	    
			return new ModelAndView("UserLogin","creationmessage","User Added Sucessfully Now Login"); 
		}
		else {	        
			return new ModelAndView("UserCreate","message","Unable to Add User"); 

		}
	}
}
