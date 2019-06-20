package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.airline.service.AirlineServiceImpl;

@Controller
public class UserForgetPasswordController {
	
		@Autowired
		private AirlineServiceImpl airportService;
		
		@RequestMapping(value = "/forgotpasswordm", method = RequestMethod.GET)
		public ModelAndView getlogin(ModelAndView mv) {
			mv.setViewName("UserForgotPassword");
			return mv;

		}

		@RequestMapping(value = "/forgotpassword",method = RequestMethod.POST) 
		public ModelAndView forgotPassword(@RequestParam("userName") String userName,
				@RequestParam("password") String password)
		{ 
			boolean response=false;
			if(userName!=null) { 
				response=airportService.forgotPassword(userName,password);
			}

			if(response) {	      	    
				return new ModelAndView("UserLogin","creationmessage","Password Reset Done Sucessfully"); 
			}
			else {	        
				return new ModelAndView("UserForgotPassword","message","Please Enter Your Correct UserName"); 

			}
		}
}
