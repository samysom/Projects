package com.university.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.university.service.UniversityServiceJPAImpl;
@Controller
public class ApplicationStatusMVC {
	
	@Autowired
	UniversityServiceJPAImpl service;
	
	@RequestMapping(value="/applicationstatusmvc", method=RequestMethod.GET)
	public ModelAndView getApplicationStatus(ModelAndView mv)
	{
		mv.setViewName("view_status");
		return mv;

}
	
	
	@RequestMapping(value="/applicationstatusmvclog", method=RequestMethod.POST)
	@ResponseBody
	public void doApplicationStatus( HttpServletResponse resp,
			ModelAndView mv,HttpServletRequest req) throws ServletException, IOException 
	{
		long id=Integer.parseInt(req.getParameter("appId"));
		boolean state=service.searchApplicationStatus(id);
		PrintWriter out=resp.getWriter();
		
		
		 if(state==true)
			{
				
				out.print("<h1>"+" your application is accepted"+"</h1>");
			}else
			{
				out.print("<h1>"+" sorry your application is rejected"+"</h1>");
			}
	

}
	
	

}
