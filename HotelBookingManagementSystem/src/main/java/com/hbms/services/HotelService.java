package com.hbms.services;

import java.util.Date;
import java.util.List;

import com.hbms.dto.BookingDetails;
import com.hbms.dto.Hotel;

import com.hbms.dto.RoomDetails;
import com.hbms.dto.Users;

public interface HotelService {
	
	boolean registerUser(Users user);
	Users usersLogin(String username,String password,String role);
	boolean bookHotel(BookingDetails booking);
	boolean addHotel(Hotel hotel);
	boolean deleteHotel(String hotel_id);
	boolean modifyHotel(Hotel hotel);
	boolean addRoom(RoomDetails room);
	boolean deleteRoom(String room_id);
	boolean modifyRoom(RoomDetails room);
	List<Hotel> listHotels();
	
	
}
