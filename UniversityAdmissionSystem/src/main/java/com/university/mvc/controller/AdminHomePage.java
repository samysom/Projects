package com.university.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminHomePage {
	
	@RequestMapping(value="/programoffermainmvc", method=RequestMethod.GET)
	public ModelAndView getProgramOfferedMainPage(ModelAndView mv)
	{
		mv.setViewName("poffer_operation");
		return mv;
		
	}
	@RequestMapping(value="/programschemainmvc", method=RequestMethod.GET)
	public ModelAndView getProgramScheMainPage(ModelAndView mv)
	{
		mv.setViewName("pschedule_operation");
		return mv;
		
	}
	@RequestMapping(value="/mainHomePagemvc", method=RequestMethod.GET)
	public ModelAndView mainHomePage(ModelAndView mv)
	{
		mv.setViewName("Home");
		return mv;
		
	}
	

}
