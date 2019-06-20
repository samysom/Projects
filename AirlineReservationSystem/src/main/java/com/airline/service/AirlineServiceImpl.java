package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.dao.AirlineDAO;
import com.airline.dto.AirportDTO;
import com.airline.dto.BookingInformationDTO;
import com.airline.dto.FlightInformationDTO;
import com.airline.dto.UsersDTO;

@Service
public class AirlineServiceImpl implements AirlineService {
	@Autowired
	private AirlineDAO dao;
	
	@Override
	public UsersDTO LoginUser(String userName, String password, String role) {
		UsersDTO user=dao.LoginUser(userName, password, role);
		if(user!=null)
		{
			return user;
		}
		return null;
	}

	@Override
	public boolean createUser(UsersDTO userDto) {

		boolean status = dao.createUser(userDto);
		if(status==true)
		{
		return status;
		}
		return false;
	}

	@Override
	public UsersDTO searchUser(String userName) {
		UsersDTO search=dao.searchUser(userName);
		if(search!=null)
		{
		return search;
		}
		return null;
	}
	
	@Override
	public boolean deleteUser(String userName) {
		boolean delete = dao.deleteUser(userName);
		if(delete==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(String userName, String password, long mobileNo) {
		boolean update=dao.updateUser(userName, password,mobileNo);
		if(update==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean addAirport(AirportDTO airportDTO) {
		boolean status = dao.addAirport(airportDTO);
		if(status==true)
		{
		return status;
		}
		return false;
	}

	@Override
	public boolean deleteAirport(String abbreviation) {
		boolean result = dao.deleteAirport(abbreviation);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAirport(String abbreviation, String location, String city, int zipCode) {
		boolean result = dao.updateAirport(abbreviation, location, city, zipCode);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public AirportDTO searchAirport(String abbreviation) {
		AirportDTO result = dao.searchAirport(abbreviation);
		if(result!=null)
		{
			return result;
		}
		return null;
	}

	@Override
	public boolean addFlight(FlightInformationDTO flightDTO) {
		boolean result = dao.addFlight(flightDTO);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateFlight(String flightNo, String airline, String depDate, String arrDate, String depTime,
			String arrTime, String depCity, String arrCity, double fare) {
		boolean result = dao.updateFlight(flightNo, airline, depDate, arrDate, depTime, arrTime, depCity, arrCity, fare);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteFlight(String flightNo) {
		boolean result = dao.deleteFlight(flightNo);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public FlightInformationDTO searchFlight(String flightNo) {
		FlightInformationDTO result = dao.searchFlight(flightNo);
		if(result!=null)
		{
			return result;
		}
		return null;
	}

	@Override
	public boolean booking(BookingInformationDTO bookingDetailsDTO) {
		boolean result = dao.booking(bookingDetailsDTO);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean cancelBooking(long bookingID) {
		boolean result = dao.cancelBooking(bookingID);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateBooking(long bookingId, String classType, String srcCity, String destCity) {
		boolean result = dao.updateBooking(bookingId, classType, srcCity, destCity);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean forgotPassword(String userName, String password) {
		boolean result = dao.forgotPassword(userName, password);
		if(result==true)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public List<UsersDTO> listUsers() {
		
		List<UsersDTO> userList=dao.listUsers();
		return userList;
	}

	@Override
	public List<FlightInformationDTO> listFlights() {
		List<FlightInformationDTO> list=dao.listFlights();
		if(list!=null)
		{
			return list;
		}
		return null;
	}

	@Override
	public List<BookingInformationDTO> listBookings() {
		List<BookingInformationDTO> list=dao.listBookings();
		if(list!=null)
		{
			return list;
		}
		return null;
	}
}

