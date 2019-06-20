package com.university.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogoutControllerMVC {
	
	
	@RequestMapping(value="/logoutmvc",method=RequestMethod.GET)
	@ResponseBody
	public void doLogout(HttpServletResponse resp, HttpServletRequest req) throws ServletException, IOException
	{
		
		HttpSession session = req.getSession(false);
		PrintWriter out=resp.getWriter();
		
		if(session==null) {
			
			resp.sendRedirect("./login.jsp");
		}
		if(session != null) {
			session.invalidate();
			out.print("<h1>"+"YOU HAVE LOGGED OUT"+"</h1>");
			
		}
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie c: cookies) {
				if(c.getName().equalsIgnoreCase("JSESSIONID")){
					c.setMaxAge(0);
					resp.addCookie(c);
				}
			}
		
		
		
	}

}}
