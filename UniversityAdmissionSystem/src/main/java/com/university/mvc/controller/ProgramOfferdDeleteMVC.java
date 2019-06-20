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
public class ProgramOfferdDeleteMVC {
	@Autowired
	UniversityServiceJPAImpl service;
	@RequestMapping(value="/programoffereddeletemvc", method=RequestMethod.GET)
	public ModelAndView getProgramOfferdDelete(ModelAndView mv)
	{
		mv.setViewName("programs_offeredRemove");
		return mv;
		
	}
	@RequestMapping(value="/programoffereddeletemvclog", method=RequestMethod.POST)
	@ResponseBody
	public void doProgramOfferdDelete(HttpServletResponse resp,HttpServletRequest req ,ModelAndView mv, @RequestParam("programname") String programName) throws ServletException,IOException {
		PrintWriter out=resp.getWriter();
	    boolean state=service.deleteProgram(programName);
	    if(state==true)
		{
			
			out.print("<h1>"+"program deleted"+"</h1>");
		}else
		{
			out.print("<h1>"+"program not deleted"+"</h1>");
		}
	
		
		
		
		
		
	}
	

}
