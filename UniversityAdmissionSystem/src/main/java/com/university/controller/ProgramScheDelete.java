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

@WebServlet("/progoschdudelete")
public class ProgramScheDelete extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl service=new UniversityServiceImpl();
		ProgramsScheduled scPro=new ProgramsScheduled();
		String schProId=req.getParameter("progId");
		
		boolean state=service.deleteScheduledProgram(schProId);
		 if(state==true)
			{
				
				out.print("<h1>"+"program deleted"+"</h1>");
			}else
			{
				out.print("<h1>"+"program not deleted"+"</h1>");
			}

		
		
	}
	

}
