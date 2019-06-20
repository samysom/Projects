package com.university.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.university.dto.ProgramsOffered;
import com.university.dto.ProgramsScheduled;
import com.university.service.UniversityServiceJPAImpl;

@Controller
public class ProgramScheAddMVC {
	@Autowired
	UniversityServiceJPAImpl service;
	
	@RequestMapping(value="/programscheaddmvc", method=RequestMethod.GET)
	public ModelAndView getProgramScheAdd(ModelAndView mv)
	{
		mv.setViewName("Program_ScheduledAdd");
		return mv;
		
	}
	
	@RequestMapping(value="/programscheaddmvclog", method=RequestMethod.POST)
	@ResponseBody
	public void doProgramScheAdd(HttpServletResponse resp,@RequestParam("progId") String scheduledProgId ,@RequestParam("programname") String programName  ,@RequestParam("location") String location,@RequestParam("startdate") String startDate,
			@RequestParam("enddate") String endDate,@RequestParam("session") int session,ProgramsScheduled scPro, ModelAndView mv) throws ServletException,IOException {
		
		PrintWriter out=resp.getWriter();
		scPro.setScheduledProgId(scheduledProgId);
		scPro.setProgramName(programName);
		scPro.setLocation(location);
		scPro.setStartDate(startDate);
		scPro.setEndDate(endDate);
		scPro.setSession(session);
       boolean state=service.createScheduledProgram(scPro);
		
		
		if(state==true)
		{
			
			out.print("<h1>"+"scheduled program added"+"</h1>");
		}else
		{
			out.print("<h1>"+"scheduled program not added"+"</h1>");
		}
		

	

}}
