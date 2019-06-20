package com.hbms.dao;



import java.util.Date;
import java.util.List;

import com.hbms.dto.BookingDetails;
import com.hbms.dto.Hotel;

import com.hbms.dto.RoomDetails;
import com.hbms.dto.Users;

public interface HotelDAO {

	boolean registerUser(Users users);
	Users usersLogin(String username,String password,String role);
	boolean bookHotel(BookingDetails bookingdetails);
	boolean addHotel(Hotel hotel);
	boolean deleteHotel(String hotelid);
	boolean modifyHotel(Hotel hotel);
	boolean addRoom(RoomDetails roomdetails);
	boolean deleteRoom(String roomid);
	boolean modifyRoom(RoomDetails roomdetails);
	List<Hotel> listHotels();





}
