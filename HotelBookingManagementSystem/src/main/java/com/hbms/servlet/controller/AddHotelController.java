package com.hbms.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hbms.dto.Hotel;
import com.hbms.service.ImplService;

@WebServlet("/addhotel")
public class AddHotelController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		ImplService impl=new ImplService();
		PrintWriter out=resp.getWriter();

		String hotelId = req.getParameter("hotelid");
		String city = req.getParameter("city");
		String hotelName = req.getParameter("hotelname");
		String address = req.getParameter("address");
		String description = req.getParameter("description");
		double averageRatePernight = Double.parseDouble(req.getParameter("avgratepernight"));  
		String phoneNo1 = req.getParameter("phoneno1");
		String phoneNo2 = req.getParameter("phoneno2");
		String rating = req.getParameter("rating");
		String email = req.getParameter("email");
		String fax = req.getParameter("fax");




		Hotel h = new Hotel();

		h.setHotelid(hotelId);
		h.setCity(city);
		h.setHotelname(hotelName);
		h.setAddress(address);
		h.setDescription(description);
		h.setAvgratepernight(averageRatePernight);
		h.setPhoneno1(phoneNo1);
		h.setPhoneno2(phoneNo2);
		h.setRating(rating);
		h.setEmail(email);
		h.setFax(fax);

		boolean add =impl.addHotel(h);
		if(add)
		{
			out.println("Hotel added successfully");  
		}
		else
		{
			out.println("Something went wrong");
		}
	}
}



