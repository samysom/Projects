package com.airline.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.airline.dto.AirportDTO;
import com.airline.dto.BookingInformationDTO;
import com.airline.dto.FlightInformationDTO;
import com.airline.dto.UsersDTO;
import com.airline.repository.*;

public class AirlineDAOImpl extends Url implements AirlineDAO 
{
	Url url=new Url();

	@Override
	public boolean createUser(UsersDTO users) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			con = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "insert into Users values(?,?,?,?)";

			pstmt = con.prepareStatement(query);
			pstmt.setString(1,users.getUserName());
			pstmt.setString(2, users.getPassword());
			pstmt.setString(3, users.getRole());
			pstmt.setLong(4,users.getMobileNo());

			int count = pstmt.executeUpdate();

			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				try 
				{
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try 
				{
					pstmt.close();
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return false;	
	}
	@Override
	public UsersDTO LoginUser(UsersDTO users) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			con = DriverManager.getConnection(url.DbUrl(),prop);

			String query="select * from Users where username=? and password=? and role=?";
			
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,users.getUserName());
			pstmt.setString(2,users.getPassword());
			pstmt.setString(3, users.getRole());

			rs=pstmt.executeQuery();

			if(rs.next() )
			{
				return users;
			}
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				try
				{
					con.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();	
				}	
			}
			if(pstmt!=null)
			{
				try
				{
					pstmt.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();	
				}	
			}
			if(rs!=null)
			{
				try
				{
					rs.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();	
				}	
			}
		}
		return null;
	}

	@Override
	public UsersDTO updateUser(UsersDTO users) 
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "Update Users set username=?, password=?, moblie_no=? where role=?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1,users.getUserName());
			preparedStatement.setString(2,users.getPassword());
			preparedStatement.setLong(3,users.getMobileNo());
			preparedStatement.setString(4,users.getRole());

			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return users;
			}
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try 
				{
					connection.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try 
				{
					preparedStatement.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	@Override
	public boolean deleteUser(String userName) 
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "Delete from users where username=?";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,userName);

			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return true;
			}
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public UsersDTO searchUser(String userName) 
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		UsersDTO dto=new UsersDTO();		
		try{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "SELECT * FROM users WHERE username=?";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userName);

			resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				dto.setUserName(resultSet.getString("username"));
				dto.setPassword(resultSet.getString("password"));
				dto.setMobileNo(resultSet.getLong("mobile_no"));
				dto.setRole(resultSet.getString("role"));

				return dto;
			}
			else
			{
				return null;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultSet!=null)
			{
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	@Override
	public boolean addAirport(AirportDTO airportDTO) 
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "insert into airport values(?,?,?,?,?,?)";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1,airportDTO.getAirportName());
			preparedStatement.setString(2,airportDTO.getAbbreviation());
			preparedStatement.setString(3,airportDTO.getLocation());
			preparedStatement.setString(4,airportDTO.getCity());
			preparedStatement.setString(5,airportDTO.getState());
			preparedStatement.setInt(6,airportDTO.getZipCode());

			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return true;
			}
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false ;
	}

	@Override
	public boolean updateAirport(AirportDTO airportDTO) 
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "Update airport set AirportName=?, Location=?, City=?, state=?, zipcode=? where Abbreviation=?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1,airportDTO.getAirportName());
			preparedStatement.setString(2,airportDTO.getLocation());
			preparedStatement.setString(3,airportDTO.getCity());
			preparedStatement.setString(4,airportDTO.getState());
			preparedStatement.setInt(5,airportDTO.getZipCode());
			preparedStatement.setString(6,airportDTO.getAbbreviation());

			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteAirport(String abbreviation) 
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "Delete from airport where Abbreviation=?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1,abbreviation);
			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public AirportDTO searchAirport(String abbreviation)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		AirportDTO dto=new AirportDTO();		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "SELECT * FROM airport WHERE Abbreviation=?";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, abbreviation);

			resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				dto.setAirportName(resultSet.getString(1));
				dto.setAbbreviation(resultSet.getString(2));
				dto.setLocation(resultSet.getString(3));
				dto.setCity(resultSet.getString(4));
				dto.setState(resultSet.getString(5));
				dto.setZipCode(resultSet.getInt(6));

				return dto;
			}
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultSet!=null)
			{
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public boolean addFlight(FlightInformationDTO flightDTO) 
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "insert into Flightinformation values(?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1,flightDTO.getFlightNo());
			preparedStatement.setString(2, flightDTO.getAirline());
			preparedStatement.setString(3, flightDTO.getDepCity());
			preparedStatement.setString(4, flightDTO.getArrCity());

			preparedStatement.setDate(5, flightDTO.getDepDate());
			preparedStatement.setDate(6, flightDTO.getArrDate());

			preparedStatement.setInt(7,flightDTO.getFirstSeats());
			preparedStatement.setInt(8,flightDTO.getFirstSeatFare());
			preparedStatement.setInt(9,flightDTO.getBussSeats());
			preparedStatement.setInt(10,flightDTO.getBussSeatsFare());

			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return true;
			}
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false ;
	}

	@Override
	public boolean updateFlight(FlightInformationDTO flightDTO)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "Update flightinformation set airline=?, dep_city=?, arr_city=?, dep_date=?, arr_date=?,"
					         + "FirstSeats=?, FirstSeatFare=?,BussSeats=?, BussSeatsFare=? where flightno=?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1,flightDTO.getAirline());
			preparedStatement.setString(2,flightDTO.getDepCity());
			preparedStatement.setString(3,flightDTO.getArrCity());
			preparedStatement.setDate(4,flightDTO.getDepDate());
			preparedStatement.setDate(5,flightDTO.getArrDate());
			
			preparedStatement.setInt(6,flightDTO.getFirstSeats());
			preparedStatement.setInt(7,flightDTO.getFirstSeatFare());
			preparedStatement.setInt(8,flightDTO.getBussSeats());
			preparedStatement.setInt(9,flightDTO.getBussSeatsFare());
			preparedStatement.setString(10,flightDTO.getFlightNo());

			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return true;
			}
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	@Override
	public boolean deleteFlight(String flightNo)
	{

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "Delete from flightinformation where flightno=?";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,flightNo);

			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return true;
			}
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public FlightInformationDTO searchFlight(String flightNo)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		FlightInformationDTO dto=new FlightInformationDTO();

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "select * from flightinformation where flightno=?";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,flightNo);

			resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				dto.setFlightNo(resultSet.getString(1));
				dto.setAirline(resultSet.getString(2));
				dto.setDepCity(resultSet.getString(3));
				dto.setArrCity(resultSet.getString(4));

				dto.setDepDate(resultSet.getDate(5));
				dto.setArrDate(resultSet.getDate(6));

				dto.setFirstSeats(resultSet.getInt(7));
				dto.setFirstSeatFare(resultSet.getInt(8));
				dto.setBussSeats(resultSet.getInt(9));
				dto.setBussSeatsFare(resultSet.getInt(10));

				return dto;
			}
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultSet!=null)
			{
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public boolean booking(BookingInformationDTO bookingDetailsDTO) 
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "insert into bookinginformation values(?,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1,bookingDetailsDTO.getBookingId());
			preparedStatement.setString(2,bookingDetailsDTO.getCustEmail());
			preparedStatement.setInt(3,bookingDetailsDTO.getNoOfPassengers());
			preparedStatement.setString(4,bookingDetailsDTO.getClassType());
			preparedStatement.setInt(5,bookingDetailsDTO.getTotalFare());

			preparedStatement.setString(6,bookingDetailsDTO.getSeatNumber());
			preparedStatement.setString(7,bookingDetailsDTO.getCreditCardInfo());

			preparedStatement.setString(8,bookingDetailsDTO.getSrcCity());
			preparedStatement.setString(9,bookingDetailsDTO.getDestCity());

			int count = preparedStatement.executeUpdate();
			if(count>0)
			{
				return true;
			}
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null)
			{
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public List<UsersDTO> listUsers() 
	{
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		List<UsersDTO> list=new ArrayList<UsersDTO>();

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "select * from users";

			statement = connection.createStatement();
			resultSet =statement.executeQuery(query);

			while(resultSet.next())
			{
				UsersDTO usersDTO=new UsersDTO();
				usersDTO.setUserName(resultSet.getString("username"));
				usersDTO.setMobileNo(resultSet.getLong("mobile_no"));
				usersDTO.setRole(resultSet.getString("role"));
				list.add(usersDTO);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null)
			{
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultSet!=null)
			{
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public List<FlightInformationDTO> listFlights() 
	{
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		List<FlightInformationDTO> list=new ArrayList<FlightInformationDTO>();
		try{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "select * from flightinformation";

			statement = connection.createStatement();
			resultSet =statement.executeQuery(query);

			while(resultSet.next())
			{
				FlightInformationDTO flightDTO=new FlightInformationDTO();

				flightDTO.setFlightNo(resultSet.getString("flightno"));
				flightDTO.setAirline(resultSet.getString("airline"));
				flightDTO.setDepCity(resultSet.getString("dep_city"));
				flightDTO.setArrCity(resultSet.getString("arr_city"));

				flightDTO.setDepDate(resultSet.getDate("dep_date"));
				flightDTO.setArrDate(resultSet.getDate("arr_date"));

				flightDTO.setFirstSeats(resultSet.getInt("FirstSeats"));
				flightDTO.setFirstSeatFare(resultSet.getInt("FirstSeatFare"));
				flightDTO.setBussSeats(resultSet.getInt("BussSeats"));
				flightDTO.setBussSeatsFare(resultSet.getInt("BussSeatsFare"));

				list.add(flightDTO);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null)
			{
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultSet!=null)
			{
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public List<BookingInformationDTO> listBookings(BookingInformationDTO bookingDetailsDTO)
	{
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		List<BookingInformationDTO> list=new ArrayList<BookingInformationDTO>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			FileReader reader=new FileReader(url.getPath());
			Properties prop=new Properties();
			prop.load(reader);
			connection = DriverManager.getConnection(url.DbUrl(),prop);

			String query = "Select * from bookinginformation";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while(resultSet.next())
			{
				bookingDetailsDTO=new BookingInformationDTO();

				bookingDetailsDTO.setBookingId(resultSet.getString(1));
				bookingDetailsDTO.setCustEmail(resultSet.getString(2));
				bookingDetailsDTO.setNoOfPassengers(resultSet.getInt(3));
				bookingDetailsDTO.setClassType(resultSet.getString(4));
				bookingDetailsDTO.setTotalFare(resultSet.getInt(5));
				bookingDetailsDTO.setSeatNumber(resultSet.getString(6));
				bookingDetailsDTO.setCreditCardInfo(resultSet.getString(7));
				bookingDetailsDTO.setSrcCity(resultSet.getString(8));
				bookingDetailsDTO.setDestCity(resultSet.getString(9));

				list.add(bookingDetailsDTO);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null)
			{
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultSet!=null)
			{
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
}
