package com.hbms.servlet.controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hbms.dto.RoomDetails;
import com.hbms.service.ImplService;


@WebServlet("/modifyroom")
public class ModifyRoomController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		ImplService impl = new ImplService();
		PrintWriter out=resp.getWriter();

		String hotelid=req.getParameter("hotelid");
		String roomid=req.getParameter("roomid");
		String roomno=req.getParameter("roomno");
		String roomtype=req.getParameter("roomtype");
		double price=Double.parseDouble(req.getParameter("pernightrate"));
		String available=req.getParameter("availability");


		RoomDetails details= new RoomDetails();

		details.setHotelid(hotelid);
		details.setRoomid(roomid);
		details.setRoomno(roomno);
		details.setRoomtype(roomtype);
		details.setPernightrate(price);
		details.setAvailability(available);

		boolean rs=impl.modifyRoom(details);
		System.out.println(rs);

		if(rs)
		{
			out.println("Room modified successfully");		
		}else
		{
			out.println("Something went wrong");
		}
	}
}
