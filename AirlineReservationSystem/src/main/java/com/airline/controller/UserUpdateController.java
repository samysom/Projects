package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller
public class UserUpdateController {
	@Autowired
	private AirlineServiceImpl airportService;
	
	@RequestMapping(value = "/updatem", method = RequestMethod.GET)
	public ModelAndView getUpdate(ModelAndView mv) {
		mv.setViewName("UserUpdate");
		return mv;

	}

	@RequestMapping(value = "/update",method = RequestMethod.POST) 
	public ModelAndView updateUser(@RequestParam("userName") String userName,
			@RequestParam("password") String password,
			@RequestParam("mobileNo") long mobileNo) { 
		boolean response=false;
		if(userName!=null) { 
			response=airportService.updateUser(userName,password,mobileNo);
		}

		if(response) {	      	    
			return new ModelAndView("UserLogin","message","User details Updated"); 
		}
		else {	        
			return new ModelAndView("UserUpdate","message","Unable to Update Details Please Enter Valid User Name"); 

		}
	}

}
