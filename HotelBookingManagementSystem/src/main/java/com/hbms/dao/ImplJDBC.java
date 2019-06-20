package com.hbms.dao;

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
import java.util.Scanner;

import com.hbms.dto.BookingDetails;
import com.hbms.dto.Hotel;
import com.hbms.dto.RoomDetails;
import com.hbms.dto.Users;
import com.hbms.util.URL;

public class ImplJDBC implements HotelDAO{

	Users user = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	URL url = new URL();


	@Override
	public boolean registerUser(Users users) {
		boolean state=false;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			con=DriverManager.getConnection(url.getURL());

			String query = "insert into Users values(?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,users.getUserid());
			pstmt.setString(2,users.getPassword());
			pstmt.setString(3,users.getRole());
			pstmt.setString(4,users.getUsername());
			pstmt.setString(5,users.getMobileno());
			pstmt.setString(6,users.getPhone());
			pstmt.setString(7,users.getAddress());
			pstmt.setString(8,users.getEmail());
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				state=true;
			}
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			return state;
		}
	}


	@Override
	public Users usersLogin(String username, String password, String role) {


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query = "select * from Users where user_name =? and password=? and role=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setString(3, role);
			rs = pstmt.executeQuery();

			if(rs.next())
			{
				Users u=new Users();

				u.setUserid(rs.getString("user_name"));
				u.setPassword(rs.getString("password"));
				u.setRole(rs.getString("role"));

				user=u;

			}
		}

		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}		
			return user;
		}
	}


	@Override
	public boolean bookHotel(BookingDetails bookingdetails) {
		boolean state=false;

		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query = "insert into BookingDetails values(?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,bookingdetails.getBookingid());
			pstmt.setString(2,bookingdetails.getRoomid());
			pstmt.setString(3,bookingdetails.getUserid());
			pstmt.setString(4,bookingdetails.getBookedfrom());
			pstmt.setString(5,bookingdetails.getBookedto());
			pstmt.setInt(6,bookingdetails.getNoofadults());
			pstmt.setInt(7,bookingdetails.getNoofchildren());
			pstmt.setString(8,bookingdetails.getAmount());

			int count = pstmt.executeUpdate();
			if(count>0)
			{
				state=true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			return state;
		}
	}

	@Override
	public boolean addHotel(Hotel hotel) {
		boolean state=false;

		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query = "insert into Hotel values(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,hotel.getHotelid());
			pstmt.setString(2,hotel.getCity());
			pstmt.setString(3,hotel.getHotelname());
			pstmt.setString(4,hotel.getAddress());
			pstmt.setString(5,hotel.getDescription());
			pstmt.setDouble(6,hotel.getAvgratepernight());
			pstmt.setString(7,hotel.getPhoneno1());
			pstmt.setString(8,hotel.getPhoneno2());
			pstmt.setString(9,hotel.getRating());
			pstmt.setString(10,hotel.getEmail());
			pstmt.setString(11,hotel.getFax());

			int count = pstmt.executeUpdate();

			if(count>0)
			{
				state=true;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

			return state;
		}
	}


	@Override
	public boolean deleteHotel(String hotel_id) {
		boolean state=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query = "delete from Hotel where hotel_id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, hotel_id);
			int count = pstmt.executeUpdate();

			if(count>0)
			{
				state=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

			return state;
		}
	}



	@Override
	public boolean modifyHotel(Hotel hotel) {
		boolean state=false;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			con=DriverManager.getConnection(url.getURL());

			String query="update Hotel set city=?,hotel_name=?,address=?,description=?,avg_rate_pernight=?,phone_no1=?,phone_no2=?,rating=?,email=?,fax=?where hotel_id=? ";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,hotel.getCity());
			pstmt.setString(2,hotel.getHotelname());
			pstmt.setString(3,hotel.getAddress());
			pstmt.setString(4,hotel.getDescription());
			pstmt.setDouble(5,hotel.getAvgratepernight());
			pstmt.setString(6,hotel.getPhoneno1());
			pstmt.setString(7,hotel.getPhoneno2());
			pstmt.setString(8,hotel.getRating());
			pstmt.setString(9,hotel.getEmail());
			pstmt.setString(10,hotel.getFax());
			pstmt.setString(11, hotel.getHotelid());
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				state=true;
			}
		}catch(Exception e) {
			e.printStackTrace();

		}
		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

			return state;
		}
	}



	@Override
	public boolean addRoom(RoomDetails roomdetails) {
		boolean state=false;

		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query = "insert into RoomDetails values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,roomdetails.getHotelid());
			pstmt.setString(2,roomdetails.getRoomid());
			pstmt.setString(3,roomdetails.getRoomno());
			pstmt.setString(4,roomdetails.getRoomtype());
			pstmt.setDouble(5,roomdetails.getPernightrate());
			pstmt.setString(6,roomdetails.getAvailability());
			//pstmt.setBlob(7,roomdetails.getPhoto());


			int count = pstmt.executeUpdate();

			if(count>0)
			{
				state=true;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

			return state;
		}
	}



	@Override
	public boolean deleteRoom(String room_id) {
		boolean state=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query = "delete from RoomDetails where room_id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, room_id);
			int count = pstmt.executeUpdate();

			if(count>0)
			{
				state=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

			return state;
		}
	}




	@Override
	public boolean modifyRoom(RoomDetails roomdetails) {
		boolean state=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query="update RoomDetails set hotel_id=?,room_no=?,room_type=?,per_night_rate=?,availability=? where room_id=? ";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,roomdetails.getHotelid());
			pstmt.setString(2,roomdetails.getRoomno());
			pstmt.setString(3,roomdetails.getRoomtype());
			pstmt.setDouble(4,roomdetails.getPernightrate());
			pstmt.setString(5,roomdetails.getAvailability());
			//pstmt.setBlob(6,roomdetails.getPhoto());
			pstmt.setString(6,roomdetails.getRoomid());
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				state=true;
			}
			else
			{
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();

		}
		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

			return state;
		}
	}


	@Override
	public List<Hotel> listHotels() {
		List<Hotel> list = new ArrayList<Hotel>();
		Hotel hotel=new Hotel();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url.getURL());

			String query = "select * from Hotel";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while(rs.next()) {
				Hotel h=new Hotel();
				h.setHotelid(rs.getString("hotel_id"));
				h.setCity(rs.getString("city"));
				h.setHotelname(rs.getString("hotel_name"));
				h.setAddress(rs.getString("address"));
				h.setDescription(rs.getString("description"));
				h.setAvgratepernight(rs.getDouble("avg_rate_pernight"));
				h.setPhoneno1(rs.getString("phone_no1"));
				h.setPhoneno2(rs.getString("phone_no2"));
				h.setRating(rs.getString("rating"));
				h.setEmail(rs.getString("email"));
				h.setFax(rs.getString("fax"));
				list.add(h);

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			return list;
		}
	}
}





