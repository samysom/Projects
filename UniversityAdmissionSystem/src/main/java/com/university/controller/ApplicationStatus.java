package com.university.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.university.dto.Application;
import com.university.service.UniversityServiceImpl;

@WebServlet("/applicationstatus")
public class ApplicationStatus extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl service=new UniversityServiceImpl();
		Application a=new Application();
        
	long id=Integer.parseInt(req.getParameter("appId"));
		
		   boolean state=service.searchApplicationStatus(id);
		    if(state==true)
			{
				
				out.print("<h1>"+" your application is accepted"+"</h1>");
			}else
			{
				out.print("<h1>"+" sorry your application is rejected"+"</h1>");
			}
		
		
		
		
	}
	

}
