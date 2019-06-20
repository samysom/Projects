package com.university.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.university.dto.Application;
import com.university.service.UniversityServiceJPAImpl;
@Controller
public class ApplicationListMVC {
	
	@Autowired
	UniversityServiceJPAImpl service;
	
	
	@RequestMapping(value="/listAllapplicationmvclog", method=RequestMethod.POST)
	public String listAllApplications(HttpServletResponse resp,HttpServletRequest req) throws IOException
	{
		ModelAndView mv=new ModelAndView();
	
		 List<Application> li=service.listAllApplications();
		 

		  if(li!=null)
	 		{
			  
				HttpSession session=req.getSession(false);
				session.setAttribute("listy", li);
		
				return "listapplicationTable";
	        	 
			
	 		}
	 		else
	 		{
	 			return "Home";
	 		}

		
	}

}
