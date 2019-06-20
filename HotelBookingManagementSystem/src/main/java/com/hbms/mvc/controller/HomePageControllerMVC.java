package com.hbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hbms.services.ServicesJPA;


@Controller
public class HomePageControllerMVC {
@Autowired
ServicesJPA service;

@RequestMapping(value="/homepagemvc", method=RequestMethod.GET)
public ModelAndView getHotelAdd(ModelAndView mv)
{
	mv.setViewName("HomePage");
	return mv;
	
}
}
