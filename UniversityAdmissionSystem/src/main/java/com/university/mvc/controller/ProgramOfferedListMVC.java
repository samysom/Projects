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
import com.university.dto.ProgramsOffered;
import com.university.service.UniversityServiceJPAImpl;

@Controller
public class ProgramOfferedListMVC {
	@Autowired
	UniversityServiceJPAImpl service;
	
	@RequestMapping(value="/listprogramofferedmvclog", method=RequestMethod.POST)

	public String listAllProgramsOffered(HttpServletResponse resp,HttpServletRequest req,ModelAndView mv) throws IOException
	{
		PrintWriter out=resp.getWriter();
		  ProgramsOffered prog=new ProgramsOffered();
		   List<ProgramsOffered> li=service.listAllPrograms();
			if(li!=null)
			{
				HttpSession session=req.getSession(false);
				session.setAttribute("listy", li);

				return "listofferprog";
				 
			}
			else
			{
				return "Home";
				
			}
}}
