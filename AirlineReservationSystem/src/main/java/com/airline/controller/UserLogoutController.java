package com.airline.controller;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserLogoutController {

	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){
		HttpSession httpSession = request.getSession(false);
		if(httpSession!=null)
		{
			httpSession.invalidate();
		}
		
		
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i< cookies.length ; ++i){
			if(cookies[i].getName().equals("JSESSIONID")){
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
				break;}
			
		}
		ModelAndView model = new ModelAndView("UserLogin","creationmessage","You Logged Out");
		return model;
	}
}
