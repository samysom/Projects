package com.hbms.service;

import java.util.List;

import com.hbms.dao.ImplJDBC;
import com.hbms.dto.BookingDetails;
import com.hbms.dto.Hotel;
import com.hbms.dto.RoomDetails;
import com.hbms.dto.Users;

public class ImplService implements HotelService {

	ImplJDBC impl=new ImplJDBC();

	@Override
	public boolean registerUser(Users users) {

		boolean b=impl.registerUser(users);
		if(b==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public Users usersLogin(String username, String password, String role) {

		Users us=impl.usersLogin(username, password, role);
		if(us!=null)
		{
			return us;
		}
		return null;
	}


	@Override
	public boolean bookHotel(BookingDetails bookingdetails) {
		boolean b=impl.bookHotel(bookingdetails);
		if(b==true) {
			return b;
		}
		return false;
	}


	@Override
	public boolean addHotel(Hotel hotel) {
		boolean b=impl.addHotel(hotel);
		if(b==true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteHotel(String hotel_id) {

		boolean b=impl.deleteHotel(hotel_id);
		if(b==true) {
			return true;
		}
		return false;
	}


	@Override
	public boolean modifyHotel(Hotel hotel) {

		boolean b=impl.modifyHotel(hotel);
		if(b==true) {
			return true;
		}
		return false;
	}


	@Override
	public boolean addRoom(RoomDetails roomdetails) {

		boolean b=impl.addRoom(roomdetails);
		if(b==true) {
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteRoom(String room_id) {

		boolean b=impl.deleteRoom(room_id);
		if(b==true) {
			return true;
		}
		return false;
	}


	@Override
	public boolean modifyRoom(RoomDetails roomdetails) {

		boolean b=impl.modifyRoom(roomdetails);
		if(b==true) {
			return true;
		}
		return false;
	}


	@Override
	public List<Hotel> listHotels() {

		List<Hotel> hotel=impl.listHotels();
		if(hotel!=null) {
			return hotel;
		}
		return null;
	}
}
