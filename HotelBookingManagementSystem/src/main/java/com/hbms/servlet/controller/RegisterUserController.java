package com.hbms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hbms.dto.Users;
import com.hbms.service.ImplService;

@WebServlet("/register")
public class RegisterUserController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		ImplService impl = new ImplService();
		PrintWriter out=resp.getWriter();

		String userid = req.getParameter("userid");
		String password=req.getParameter("password");
		String role=req.getParameter("role");
		String userName=req.getParameter("username");
		String mobileNo=req.getParameter("mobileno");
		String phone=req.getParameter("phone");
		String address=req.getParameter("address");
		String email=req.getParameter("email");


		Users user=new Users();

		user.setUserid(userid);
		user.setPassword(password);
		user.setRole(role);
		user.setUsername(userName);
		user.setMobileno(mobileNo);
		user.setPhone(phone);
		user.setAddress(address);
		user.setEmail(email);

		boolean result = impl.registerUser(user);
		System.out.println(result);

		if(result==true)
		{
			out.println("registration is successful");
		}
		else
		{
			out.println("registration is not successful");
		}


	}


}
