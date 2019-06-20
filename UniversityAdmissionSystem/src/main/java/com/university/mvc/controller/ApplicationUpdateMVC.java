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

import com.university.dto.Application;
import com.university.service.UniversityServiceJPAImpl;

@Controller
public class ApplicationUpdateMVC {
	
	@Autowired
	UniversityServiceJPAImpl service;
	@RequestMapping(value="/applicationupdatemvc", method=RequestMethod.GET)
	public ModelAndView getApplicationUpdate(ModelAndView mv)
	{
		mv.setViewName("update_application");
		return mv;

}        
	@RequestMapping(value="/applicationupdatemvclog", method=RequestMethod.POST)
	
	public ModelAndView doApplicationUpdate(HttpServletRequest req,HttpServletResponse resp,
			ModelAndView mv) throws ServletException, IOException {
		{
			Application app = new Application();
			System.out.println("inside app");
			app.setApplicId(Long.parseLong(req.getParameter("appId")));
			app.setFullName(req.getParameter("fullName"));
	        app.setDob(req.getParameter("dob"));
	        app.setQualification(req.getParameter("qualification"));
	        app.setMarks(Integer.parseInt(req.getParameter("marks")));
	        app.setGoals(req.getParameter("goals"));
	        app.setEmail(req.getParameter("email"));
	        app.setScheduledProgId(req.getParameter("scheduledId"));
	        app.setStatus("single");
	        app.setInterviewDate(req.getParameter("interviewDate"));
		  boolean state=service.updateApplication(app);
	
		  String msg = "";
			
				if(state) {
					msg = "application updated";
				}else {
					msg = "application not updated";
				}
				mv.addObject("msg",msg);
				mv.setViewName("Msg");
				
				return mv;	}
	 
	
	

	}}
