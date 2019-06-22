package com.library.project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/st")
public class StudentHomeController {
	@GetMapping(value="/home2")
	public ModelAndView StudentHome(ModelAndView mv) {
		mv.setViewName("StudentHome1");
		return mv;
	}
}
