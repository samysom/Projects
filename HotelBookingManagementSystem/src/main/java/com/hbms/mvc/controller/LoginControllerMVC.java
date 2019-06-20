package com.hbms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hbms.dto.Users;
import com.hbms.services.ServicesJPA;



@Controller

public class LoginControllerMVC {
	@Autowired
	ServicesJPA service;
	
	@RequestMapping(value="/loginmvc", method=RequestMethod.GET)
	public ModelAndView getLogin(ModelAndView mv)
	{
		mv.setViewName("Login");
		return mv;
		
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView doLogin(HttpServletResponse resp,HttpServletRequest req,
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("role") String role,ModelAndView mv) throws ServletException, IOException
	{
		Users u=null;
		u=service.usersLogin(username, password,role);
		
		if(u==null){
			
			mv.setViewName("Login");
		}
		
		if(u!=null) 
		{
			HttpSession session=req.getSession();   
		if(u.getRole().equals("admin"))         
		{
			
        	mv.setViewName("AdminHomePage");
		}
		
		else if(u.getRole().equals("user")) {
			
		
			mv.setViewName("UserHomePage");
		}
		else if(u.getRole().equals("employee")) {
			
			
			mv.setViewName("UserHomePage");
		}
		
		
	
		
	}
		return mv;
	
	
	

	}
}
