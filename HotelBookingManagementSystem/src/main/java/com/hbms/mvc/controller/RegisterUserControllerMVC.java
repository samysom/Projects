package com.hbms.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
public class RegisterUserControllerMVC {
	@Autowired
	ServicesJPA service;
	
	@RequestMapping(value="/registermvc", method=RequestMethod.GET)
	public ModelAndView getRegisterUser(ModelAndView mv)
	{
		mv.setViewName("Register");
		return mv;
		
	}
	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void doRegisterUser(HttpServletResponse resp,HttpServletRequest req,@RequestParam("userid") String userid,@RequestParam("password") String password,@RequestParam("role") String role,@RequestParam("username") String username,@RequestParam("mobileno") String mobileno,@RequestParam("phone") String phone,@RequestParam("email") String email,@RequestParam("address") String address,Users user,ModelAndView mv) throws ServletException, IOException
	{
		PrintWriter out=resp.getWriter();
		user.setUserid(userid);
		user.setPassword(password);
		user.setRole(role);
		user.setUsername(username);
		user.setMobileno(mobileno);
		user.setPhone(phone);
		user.setAddress(address);
		user.setEmail(email);
		boolean us=service.registerUser(user);
		if(us==true)
		{
			
			out.print("<h1>"+"Registered successfully"+"</h1>");
		}else
		{
			out.print("<h1>"+"Not Registered"+"</h1>");
		}
		
}
		
	
}

