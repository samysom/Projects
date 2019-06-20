package com.university.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.university.dto.ProgramsOffered;
import com.university.service.UniversityServiceImpl;


@WebServlet("/progofferedupdate")
public class ProgramOfferedUpdate extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl service=new UniversityServiceImpl();
        ProgramsOffered prog=new ProgramsOffered();
        
        prog.setEligibility(req.getParameter("eligblity"));
        prog.setProgramName(req.getParameter("programname"));
        prog.setDuration(Integer.parseInt(req.getParameter("duration")));
		prog.setDescription(req.getParameter("desc"));
		prog.setDegCerti(req.getParameter("degcerti"));
		
		boolean state=service.updateProgram(prog);
		if(state==true)
		{
			
			out.print("<h1>"+"program updated"+"</h1>");
		}else
		{
			out.print("<h1>"+"program not updated"+"</h1>");
		}
		
		
		
		
		
		
		
	}

}
