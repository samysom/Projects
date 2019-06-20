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
import org.springframework.web.servlet.ModelAndView;

import com.university.dto.Application;
import com.university.service.UniversityServiceJPAImpl;

@Controller
public class ApplicationControllerMVC {
	
	
	@Autowired
	UniversityServiceJPAImpl service;
	
	@RequestMapping(value="/applicationaddmvc", method=RequestMethod.GET)
	public ModelAndView getApplication(ModelAndView mv)
	{
		mv.setViewName("application");
		return mv;
		
	}
	
	@RequestMapping(value="/applicationaddmvclog", method=RequestMethod.POST)
	public ModelAndView doApplication(HttpServletRequest req, ModelAndView mv) throws ServletException,IOException {
		Application app = new Application();
		System.out.println("inside app");
		app.setFullName(req.getParameter("fname"));
        app.setDob(req.getParameter("dob"));
        app.setQualification(req.getParameter("qualification"));
        app.setMarks(Integer.parseInt(req.getParameter("marks")));
        app.setGoals(req.getParameter("goals"));
        app.setEmail(req.getParameter("email"));
        app.setStatus("single");
        app.setScheduledProgId(req.getParameter("scheduledId"));
        app.setInterviewDate(req.getParameter("interviewDate"));
        
        
        
        
		boolean status1 = service.applyApplication(app);
		String msg = "";

		if(status1) {
			msg = "Succesfully applied your  Application ID: " +app.getApplicId();
		}else {
			msg = "application not added";
		}
		mv.addObject("msg",msg);
		mv.setViewName("Msg");
		
		return mv;
	}
	
	

}
