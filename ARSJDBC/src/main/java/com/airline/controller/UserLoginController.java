package com.airline.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airline.dto.UsersDTO;
import com.airline.service.AirlineServiceImplJDBC;

@WebServlet("/login")
public class UserLoginController extends HttpServlet  
{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException 
		{
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			String role = req.getParameter("role");

			UsersDTO userDTO=new UsersDTO();
			
			userDTO.setPassword(password);
			userDTO.setUserName(username);
			userDTO.setRole(role);
			
			AirlineServiceImplJDBC service = new AirlineServiceImplJDBC();
	        UsersDTO userDTO2 = service.LoginUser(userDTO);
	      
	        HttpSession httpSession;
	        
	        if(userDTO2 !=null)
	        {
	        	if(userDTO.getRole()!=null)
	        	{
	        		if(userDTO.getRole().equals("Admin"))
	        		{
	        			httpSession =req.getSession();
	        			httpSession.setAttribute("user", userDTO2);
	        			resp.sendRedirect("./AdminHomePage.jsp"); 
	        		}
	        		else if(userDTO.getRole().equals("Executive"))
	        		{
	        			httpSession =req.getSession();
	        			httpSession.setAttribute("user", userDTO2);
	        			resp.sendRedirect("./ExecutiveHomePage.jsp");
	        		}
	        		else if(userDTO.getRole().equals("User"))
	        		{
	        			httpSession =req.getSession();
	        			httpSession.setAttribute("user", userDTO2);
	        			resp.sendRedirect("./UserHomepage.jsp");
	        		}
	        	}
	        }
	        else
	        {   
	        	resp.sendRedirect("./Login.jsp");
	        }
	}
}
