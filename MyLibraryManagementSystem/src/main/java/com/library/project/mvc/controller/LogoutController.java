package com.library.project.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/lot")
public class LogoutController {
	
	@GetMapping(value="/logout2")
	public ModelAndView getHome(HttpServletResponse resp, ModelAndView mv) {
		PrintWriter out=null;
		try {
			out= resp.getWriter();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		out.print("Logged Out");
		mv.setViewName("Login11");
		return mv;
	}

}
