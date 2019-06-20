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
public class ApplicationDeleteMVC {
	
	@Autowired
	UniversityServiceJPAImpl service;
	
	
	@RequestMapping(value="/applicationrejectmvc", method=RequestMethod.GET)
	public ModelAndView getApplicationReject(ModelAndView mv)
	{
		mv.setViewName("reject_application");
		return mv;

}
	
	@RequestMapping(value="/applicationrejectmvclog", method=RequestMethod.POST)
	@ResponseBody
	public void doApplicationReject(HttpServletResponse resp,HttpServletRequest req ,ModelAndView mv, @RequestParam("appid") long id) throws ServletException,IOException {
		PrintWriter out=resp.getWriter();
   
		boolean state=service.deleteApplication(id);
		   
		    if(state==true)
			{
				
				out.print("<h1>"+" application rejected"+"</h1>");
			}else
			{
				out.print("<h1>"+"application not rejected"+"</h1>");
			}
		
		
		
	}}
	
	
