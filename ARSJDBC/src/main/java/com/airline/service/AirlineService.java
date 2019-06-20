package com.airline.service;

import java.util.List;

import com.airline.dto.AirportDTO;
import com.airline.dto.BookingInformationDTO;
import com.airline.dto.FlightInformationDTO;
import com.airline.dto.UsersDTO;

public interface AirlineService 
{
	boolean createUser(UsersDTO users);
	UsersDTO LoginUser(UsersDTO users);
	UsersDTO updateUser(UsersDTO users);
	boolean deleteUser(String userName);
	UsersDTO searchUser(String users);
	
	boolean addAirport(AirportDTO airportDTO);	
	boolean updateAirport(AirportDTO airportDTO);
	boolean deleteAirport(String abbreviation);
	AirportDTO searchAirport(String abbreviation);
	
	boolean addFlight(FlightInformationDTO flightDTO);	
	boolean updateFlight(FlightInformationDTO flightDTO);
	boolean deleteFlight(String flightNo);
	FlightInformationDTO searchFlight(String flightNo );
	
	boolean booking(BookingInformationDTO bookingDetailsDTO);
	
	List<UsersDTO> listUsers();
	List<FlightInformationDTO> listFlights();
	List<BookingInformationDTO> listBookings(BookingInformationDTO bookingDetailsDTO);
}
