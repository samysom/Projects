package com.library.project.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.dto.UserJPA;
import com.library.project.service.LibraryService;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller
//@RequestMapping("/lon")
public class LoginController {
	@Autowired
	LibraryServiceJPAImpl ser;
	
	LibraryService service=new LibraryServiceJPAImpl();
	@RequestMapping(value="/lo1",method=RequestMethod.GET)
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Login11");
		return mv;
	}

	@RequestMapping(value="/log34", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req,ModelAndView mv,@RequestParam("user_id") String id,@RequestParam("password") String pass, @RequestParam("role") String role) {

		UserJPA state = service.login1(id,pass,role);
		
		HttpSession session= req.getSession();
		if(state!=null) {
			System.out.println("Logged in");
			
			if(state.getRole().equalsIgnoreCase("Librarian")) {
				req.setAttribute("user",state);
				mv.setViewName("LibraryHome1");

			}
			else if(state.getRole().equalsIgnoreCase("Student")) {
				req.setAttribute("user",state);
				mv.setViewName("StudentHome1");
			}
			
		}else {
			System.out.println("Unable to Log in");
			mv.setViewName("Login11");
		}
		return mv;
	}
}
