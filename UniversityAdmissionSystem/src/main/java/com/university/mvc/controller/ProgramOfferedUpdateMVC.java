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
public class ProgramOfferedUpdateMVC {
	
	@Autowired
	UniversityServiceJPAImpl service;
	
	@RequestMapping(value="/programofferedupdatemvc", method=RequestMethod.GET)
	public ModelAndView getProgramOfferedUpdate(ModelAndView mv)
	{
		mv.setViewName("Pograms_OfferedUpdate");
		return mv;

}
	
	@RequestMapping(value="/programofferedupdatemvclog", method=RequestMethod.POST)
	@ResponseBody
	public void doProgramOfferedUpdate(HttpServletResponse resp,@RequestParam("programname") String programName,@RequestParam("desc") String description,@RequestParam("eligblity") String eligibility ,@RequestParam("degcerti") String degCerti,@RequestParam("duration") int duration,ProgramsOffered prog , ModelAndView mv) throws ServletException, IOException {
		{
			 PrintWriter out=resp.getWriter();
			 prog.setDegCerti(degCerti);
				prog.setDescription(description);
				prog.setDuration(duration);
				prog.setEligibility(eligibility);
				prog.setProgramName(programName);
			boolean state=service.updateProgram(prog);
			if(state==true)
			{
				
				out.print("<h1>"+"program updated"+"</h1>");
			}else
			{
				out.print("<h1>"+"program not updated"+"</h1>");
			}
		  
		  

}}}
