package com.university.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.university.dto.ProgramsScheduled;
import com.university.service.UniversityServiceImpl;

@WebServlet("/progoschdupdate")
public class ProgramScheUpdate extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl service=new UniversityServiceImpl();
		ProgramsScheduled scPro=new ProgramsScheduled();
		scPro.setStartDate(req.getParameter("startdate"));
		scPro.setSession(Integer.parseInt(req.getParameter("session")));
		scPro.setScheduledProgId(req.getParameter("progId"));
		scPro.setProgramName(req.getParameter("programname"));
		scPro.setLocation(req.getParameter("location"));
		scPro.setEndDate(req.getParameter("enddate"));
		
		
	    boolean state=service.updateScheduledProgram(scPro);
		
		
		if(state==true)
		{
			
			out.print("<h1>"+"scheduled program updated"+"</h1>");
		}else
		{
			out.print("<h1>"+"scheduled program not updated"+"</h1>");
		}
		
		
		
		
		
		
		
	}

	
	
}
