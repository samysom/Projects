package com.library.project.mvc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.project.dto.UserJPA;
import com.library.project.service.LibraryServiceJPAImpl;

@Controller

public class CreateUserController {
	@Autowired
	LibraryServiceJPAImpl services;
	
	@GetMapping(value="/create3")
	public ModelAndView addPage() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("CreateUser1");
		return mv;
	}

	@RequestMapping(value="/create4", method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest req, ModelAndView mv, 
			@RequestParam("user_id") String id,
			@RequestParam("user_name") String name,
			@RequestParam("password") String pass,
			@RequestParam("email") String mail,
			@RequestParam("role") String role
			) {
		UserJPA b=new UserJPA();
		HttpSession session= req.getSession();
	

			b.setUserId(id);
			b.setUserName(name);
			b.setEmail(mail);
			b.setPassword(pass);
			b.setRole(role);	
		
		String msg=null;
		boolean book = services.createUser1(b);
		req.setAttribute("b",book);
		if(book) {
			
			msg="User is added successfully";
			mv.setViewName("Start2");
			
			System.out.println("success");
			
			
		}else {
			msg="User can not add correctly";
			mv.setViewName("Start2");
			System.out.println("failed");
		}
		mv.addObject("Success", msg);
		return mv;
	}
}
