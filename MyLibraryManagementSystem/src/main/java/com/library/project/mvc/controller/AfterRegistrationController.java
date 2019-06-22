package com.library.project.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.dto.BookRegistrationJPA;

import com.library.project.service.LibraryServiceJPAImpl;

@Controller

public class AfterRegistrationController {

	@Autowired
	LibraryServiceJPAImpl services;
	
	@GetMapping(value="/after33")
	public ModelAndView addPage() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("AfterRegistration1");
		return mv;
	}

	@RequestMapping(value="/after4", method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest req, ModelAndView mv, 
			
			@RequestParam("registration_id") String id,
			@RequestParam("book_id") String bookid,
			@RequestParam("user_id") String user,
			@RequestParam("registrationdate") String date,
			
			BookRegistrationJPA  b) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
		
		try {
			
			b.setRegistrationDate(sdf.parse(date));
			b.setBookId(bookid);
			b.setRegistrationId(id);
			b.setUserId(user);
			
		} catch (Exception e) {	
			e.printStackTrace();
		}
		HttpSession session= req.getSession();
		boolean book = services.afterRegistration1(b);
		if(book) {
			//out.print("<h1 style='color:white'>"+"Book Is Registered"+"</h1>");
			System.out.println("book is registered");
			req.setAttribute("b",book);
			mv.setViewName("Student");
			
		}else {
			//out.println("<h1 style='color: darkorange'>"+"Book Is Not Registered"+"</h1>");
			System.out.println("book is not registered");

			mv.setViewName("AfterRegistration1");
		}
		return mv;
	}
}
