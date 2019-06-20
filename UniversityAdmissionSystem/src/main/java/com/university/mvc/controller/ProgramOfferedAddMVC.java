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

import com.university.dto.Application;
import com.university.dto.ProgramsOffered;
import com.university.service.UniversityServiceJPAImpl;

@Controller
public class ProgramOfferedAddMVC {

	@Autowired
	UniversityServiceJPAImpl service;
	
	@RequestMapping(value="/programofferedaddmvc", method=RequestMethod.GET)
	public ModelAndView getProgramOfferedAdd(ModelAndView mv)
	{
		mv.setViewName("Programs_OfferedAdd");
		return mv;
		
	}
	
	@RequestMapping(value="/programofferedaddmvclog", method=RequestMethod.POST)
	@ResponseBody
	public void doProgramOfferedAdd(HttpServletResponse resp,ProgramsOffered prog,@RequestParam("programname") String programName,@RequestParam("desc") String description,@RequestParam("eligblity") String eligibility ,@RequestParam("degcerti") String degCerti,@RequestParam("duration") int duration, ModelAndView mv) throws ServletException,IOException {
		
		PrintWriter out=resp.getWriter();
		prog.setDegCerti(degCerti);
		prog.setDescription(description);
		prog.setDuration(duration);
		prog.setEligibility(eligibility);
		prog.setProgramName(programName);
		boolean state=service.addProgram(prog);
		if(state==true)
		{
			
			out.print("<h1>"+"program added"+"</h1>");
		}else
		{
			out.print("<h1>"+"program not added"+"</h1>");
		}
	

}}
