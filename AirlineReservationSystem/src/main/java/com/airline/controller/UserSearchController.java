package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImpl;

@Controller
public class UserSearchController {

	@Autowired
	private AirlineServiceImpl airportService;
	
	@RequestMapping(value = "/searchuserm", method = RequestMethod.GET)
	public ModelAndView getlogin(ModelAndView mv) {
		mv.setViewName("UserSearch");
		return mv;
	}
	
	@RequestMapping(value = "/searchuser",method = RequestMethod.POST) 
	public ModelAndView searchUser(@RequestParam("userName") String userName) 
	{
	UsersDTO response=null;
	response=airportService.searchUser(userName);
	ModelAndView mv=new ModelAndView();
	if(response!=null) {	      	    
		mv.addObject("rs", response);
		mv.setViewName("AirportSearchResult");
	}
	else {	        
		return new ModelAndView("UserSearch","message","Invalid UserName"); 

    }
	return mv;
}
}