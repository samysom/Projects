package com.library.project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/li")
public class Library {
	@GetMapping(value="/home5")
	public ModelAndView LibraryHome(ModelAndView mv) {
		mv.setViewName("Library");
		return mv;
	}
}