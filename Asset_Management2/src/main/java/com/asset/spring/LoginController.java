package com.asset.spring;

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

import com.asset.jpa.dto.User;

import com.asset.services.AssetServiceJPA;
import com.asset.services.AssetServiceJPAimpl;

@Controller
public class LoginController {
	@Autowired
	AssetServiceJPAimpl service;
	
	@RequestMapping(value="/loginpage",method=RequestMethod.GET)
	public String getLoginPage()
	{
		return "loginpage";
	}
	
	@RequestMapping(value="/loginmvc", method=RequestMethod.POST)
	public String doLogin(HttpServletResponse resp,HttpServletRequest req,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("usertype") String usertype,ModelAndView mv) throws ServletException, IOException
	{
		
		User us=service.login(username, password, usertype);
		
		
		if(us!=null) 
		{
			HttpSession session=req.getSession();   
		if(us.getUsertype().equalsIgnoreCase("admin"))         
		{
			mv.addObject("admin", us);   
            
        	return "adminpagee";
		}
		
		else if(us.getUsertype().equalsIgnoreCase("manager")) {
			
			mv.addObject("manager", us);
		
			return "userpagee";
		}
	}
	return "loginpage";
	
	
	

	}
}
