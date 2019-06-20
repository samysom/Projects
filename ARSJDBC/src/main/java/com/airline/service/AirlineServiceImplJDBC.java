package com.airline.service;

import java.util.List;

import com.airline.dao.AirlineDAOImpl;
import com.airline.dto.AirportDTO;
import com.airline.dto.BookingInformationDTO;
import com.airline.dto.FlightInformationDTO;
import com.airline.dto.UsersDTO;

public class AirlineServiceImplJDBC implements AirlineService
{
	AirlineDAOImpl impl=new AirlineDAOImpl();

	@Override
	public boolean createUser(UsersDTO users) 
	{
		boolean result = impl.createUser(users);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public UsersDTO LoginUser(UsersDTO users) 
	{
		UsersDTO result = impl.LoginUser(users);
		if(result!=null)
		{
			return result;
		}
		return null;
	}

	@Override
	public UsersDTO updateUser(UsersDTO users) 
	{
		UsersDTO result = impl.updateUser(users);
		if(result!=null)
		{
			return result;
		}
		return null;
	}

	@Override
	public boolean deleteUser(String userName) 
	{
		boolean result = impl.deleteUser(userName);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public UsersDTO searchUser(String userDTO) 
	{
		UsersDTO result = impl.searchUser(userDTO);
		if(result!=null)
		{
			return result;
		}
		return null;
	}

	@Override
	public boolean addAirport(AirportDTO airportDTO) 
	{
		boolean result = impl.addAirport(airportDTO);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAirport(AirportDTO airportDTO) 
	{
		boolean result = impl.updateAirport(airportDTO);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAirport(String abbreviation) 
	{
		boolean result = impl.deleteAirport(abbreviation);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public AirportDTO searchAirport(String abbreviation) 
	{
		AirportDTO result = impl.searchAirport(abbreviation);
		if(result!=null)
		{
			return result;
		}
		return null;
	}

	@Override
	public boolean addFlight(FlightInformationDTO flightDTO) 
	{
		boolean result = impl.addFlight(flightDTO);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateFlight(FlightInformationDTO flightDTO) 
	{
		boolean result = impl.updateFlight(flightDTO);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteFlight(String Flight_no) 
	{
		boolean result = impl.deleteFlight(Flight_no);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public FlightInformationDTO searchFlight(String Flight_no) 
	{
		FlightInformationDTO result = impl.searchFlight(Flight_no);
		if(result!=null)
		{
			return result;
		}
		return null;
	}

	@Override
	public boolean booking(BookingInformationDTO bookingDetailsDTO) 
	{
		boolean result = impl.booking(bookingDetailsDTO);
		if(result==true)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<UsersDTO> listUsers() 
	{
		List<UsersDTO> list = impl.listUsers();
		if(list!=null)
		{
			return list;
		}
		return null;
	}

	@Override
	public List<FlightInformationDTO> listFlights() 
	{
		List<FlightInformationDTO> list = impl.listFlights();
		if(list!=null)
		{
			return list;
		}
		return null;
	}

	@Override
	public List<BookingInformationDTO> listBookings(BookingInformationDTO bookingDetailsDTO) 
	{
		List<BookingInformationDTO> list = impl.listBookings(bookingDetailsDTO);
		if(list!=null)
		{
			return list;
		}
		return null;
	}
}
