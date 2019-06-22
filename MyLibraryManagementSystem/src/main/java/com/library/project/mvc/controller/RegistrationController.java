package com.library.project.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.dto.BookInventoryJPA;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller
//@RequestMapping("/reg")
public class RegistrationController {
	@Autowired
	LibraryServiceJPAImpl services;
	
	@GetMapping(value="/registr")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Registration1");
		return mv;
	}
	
	@RequestMapping(value="/registr1", method=RequestMethod.POST)
	public ModelAndView searchByName(HttpServletRequest req, ModelAndView mv, 
										@RequestParam("book_name") String name) {
		
		HttpSession session= req.getSession();
		
		BookInventoryJPA book = services.registration1(name);
		if(book!=null) {
			//out.println("<h1 style='color:darkorange'>"+"Book is available in the inventory");
			req.setAttribute("book",book);
			System.out.println("fetched");
			mv.setViewName("Register");
			
		}else {
			//out.println("<h1 style='color:darkorange'>"+"Book is not available in the inventory");
			System.out.println("not fetched");
			mv.setViewName("Registration1");
		}
		return mv;
	}
	
}
