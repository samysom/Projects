package com.university.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.university.dto.Application;
import com.university.service.UniversityServiceImpl;

@WebServlet("/applicationservlet")
public class ApplicationController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl service=new UniversityServiceImpl();
		Application a=new Application();
		a.setFullName(req.getParameter("fname"));
        a.setDob(req.getParameter("dob"));
        a.setQualification(req.getParameter("qualification"));
        a.setMarks(Integer.parseInt(req.getParameter("marks")));
        a.setGoals(req.getParameter("goals"));
        a.setEmail(req.getParameter("email"));
        a.setScheduledProgId(req.getParameter("scheduledId"));
        a.setStatus(req.getParameter("status"));
        a.setInterviewDate(req.getParameter("interviewDate"));
        boolean status=service.applyApplication(a);
       long idd= a.getApplicId();
        
        
        if(status==true)
        {
     
        	long appId=	service.getApplicationId(a.getEmail());
        	out.print("<h1>"+"your have successfully registered,your application id is"+appId+".please remember it."+"</h1>");
        
        	
        	
        }else
        {
        	out.print("<h1>"+"Registration failed"+"</h1>");
        }
		
		
		
		
		
		
	}
	
	

}
