package com.library.project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartControllerMVC {
	@RequestMapping(value="/mvc",method=RequestMethod.GET)
	public ModelAndView start(ModelAndView mv) {
		mv.setViewName("Start1");
		return mv;
	}
}
