package com.airline.service;

import java.util.List;

import com.airline.dto.AirportDTO;
import com.airline.dto.BookingInformationDTO;
import com.airline.dto.FlightInformationDTO;
import com.airline.dto.UsersDTO;

public interface AirlineService {

	boolean createUser(UsersDTO users);
	boolean deleteUser(String userName);
	UsersDTO LoginUser(String userName, String password, String role);
	boolean updateUser(String userName, String password, long mobileNo);
	UsersDTO searchUser(String userName);
	boolean forgotPassword(String userName, String password);

	boolean addAirport(AirportDTO airportDTO);
	boolean deleteAirport(String abbreviation);
	boolean updateAirport(String abbreviation, String location, String city, int zipCode);
	AirportDTO searchAirport(String abbreviation);

	boolean addFlight(FlightInformationDTO flightDTO);
	boolean updateFlight(String flightNo, String airline, String depDate, String arrDate, String depTime, String arrTime, String depCity, String arrCity, double fare);
	boolean deleteFlight(String flightNo);
	FlightInformationDTO searchFlight(String flightNo );

	boolean booking(BookingInformationDTO bookingDetailsDTO);
	boolean cancelBooking(long bookingId);
	boolean updateBooking(long bookingId, String classType, String srcCity, String destCity);

	List<UsersDTO> listUsers();
	List<FlightInformationDTO> listFlights();
	List<BookingInformationDTO> listBookings();
}