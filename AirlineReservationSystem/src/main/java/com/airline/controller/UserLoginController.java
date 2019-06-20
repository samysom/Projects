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
public class UserLoginController {

	@Autowired
	private AirlineServiceImpl airportService;

	@RequestMapping(value = "/loginm", method = RequestMethod.GET)
	public ModelAndView getlogin(ModelAndView mv) {
		mv.setViewName("UserLogin");
		return mv;

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView LoginUsers(@RequestParam("userName") String userName, @RequestParam("password") String password,
			@RequestParam("role") String role) {
		UsersDTO state = null;
		state = airportService.LoginUser(userName, password, role);

		if (state != null) {

			if (state.getRole().equals("Admin")) {
				return new ModelAndView("AdminHomePage", "message", "Added");
			}

			if (state.getRole().equals("Executive")) {
				return new ModelAndView("ExecutiveHomePage", "message", "Added");
			}

			else if (state.getRole().equals("User")) {
				return new ModelAndView("UserHomepage", "message", "Added");
			}

		} else {
			return new ModelAndView("UserLogin", "message", "Please insert correct user name , password ,role");
		}
		return new ModelAndView();

	}
}
