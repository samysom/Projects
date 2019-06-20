package com.hbms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbms.dao.HotelDAO;
import com.hbms.dao.ImplJPA;
import com.hbms.dto.BookingDetails;
import com.hbms.dto.Hotel;
import com.hbms.dto.RoomDetails;
import com.hbms.dto.Users;
@Service
public class ServicesJPA implements HotelService{
	
	
	@Autowired
    HotelDAO impl=new ImplJPA();
	
	@Override
	public boolean registerUser(Users user) {
		boolean user1=impl.registerUser(user);
		if(user1) {
			return true;
		}else {

			return false;
		}
	}


	@Override
	public Users usersLogin(String username, String password,String role) {

		Users us=impl.usersLogin(username, password, role);
		if(us!=null)
		{
			return us;
		}
		return null;
	}
	
	@Override
	public boolean bookHotel(BookingDetails booking) {
		boolean b=impl.bookHotel(booking);
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
	public boolean addRoom(RoomDetails room) {
		boolean b=impl.addRoom(room);
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
	public boolean modifyRoom(RoomDetails room) {

		boolean b=impl.modifyRoom(room);
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
