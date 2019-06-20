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


@WebServlet("/modifyhotel")
public class ModifyHotelController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		ImplService impl = new ImplService();
		PrintWriter out=resp.getWriter();

		Hotel hotelDTO =new Hotel();

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



		hotelDTO.setHotelid(hotelId);
		hotelDTO.setCity(city);
		hotelDTO.setHotelname(hotelName);
		hotelDTO.setAddress(address);
		hotelDTO.setDescription(description);
		hotelDTO.setAvgratepernight(averageRatePernight);
		hotelDTO.setPhoneno1(phoneNo1);
		hotelDTO.setPhoneno2(phoneNo2);
		hotelDTO.setRating(rating);
		hotelDTO.setEmail(email);
		hotelDTO.setFax(fax);

		boolean h = impl.modifyHotel(hotelDTO);
		if(h)
		{
			out.println("Hotel modified successfully");
		}
		else
		{
			out.println("Something went wrong");
		}
	}
}
