package com.university.mvc.controller;

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

import com.university.dto.User;
import com.university.service.UniversityServiceJPAImpl;

@Controller
public class LoginControllerMVC {
	@Autowired                    
	UniversityServiceJPAImpl service;
	
	@RequestMapping(value="/loginmvc", method=RequestMethod.GET)
	public ModelAndView getLogin(ModelAndView mv)
	{
		mv.setViewName("login");
		return mv;
		
	}
	
	
	@RequestMapping(value="/loginmvclog", method=RequestMethod.POST)
	public ModelAndView doLogin(HttpServletResponse resp,HttpServletRequest req,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("role") String role) throws ServletException, IOException
	{
		ModelAndView mv=new ModelAndView();
		User us=service.login(username, password, role);
		if(us==null){
			
			mv.setViewName("login");
			
		}
		
		if(us!=null) 
		{
			HttpSession session=req.getSession();   
		if(us.getRole().equals("admin"))         
		{
			mv.addObject("admin", us);   
            
        	mv.setViewName("admin");
		}
		
		else if(us.getRole().equals("mac")) {
			
			mv.addObject("member", us);
		
			mv.setViewName("member");
		}
		
		
	
		
	}
		return mv;
	
	
	

	}
}
