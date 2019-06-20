package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller	
public class UserDeleteController{
	
	@Autowired
	private AirlineServiceImpl airportService;
	
	@RequestMapping(value = "/deletem", method = RequestMethod.GET)
	public ModelAndView getDelete(ModelAndView mv) {
		mv.setViewName("UserDelete");
		return mv;

	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.POST) 
	public ModelAndView deleteUser(@RequestParam("userName") String userName) { 
		boolean response=false;
		if(userName!=null) { 
			response=airportService.deleteUser(userName);
		}

		if(response) {	      	    
			return new ModelAndView("UserDelete","message","User Removed"); 
		}
		else {	        
			return new ModelAndView("UserDelete","message","Failed to Delete, Enter Your Valid UserName"); 

		}
	}


}
