package com.hbms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hbms.dto.BookingDetails;
import com.hbms.dto.Hotel;
import com.hbms.dto.RoomDetails;
import com.hbms.dto.Users;

@Repository
public class ImplJPA implements HotelDAO {

	@PersistenceUnit
	EntityManagerFactory emf;

	
	@Override
	public boolean registerUser(Users users) {
		boolean b=false;
		EntityManager manager=null;
		try {
			manager=emf.createEntityManager(); 
			manager.getTransaction().begin();
			manager.persist(users);
			manager.getTransaction().commit();

			b=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			b=false;
		}
		finally
		{
			if(manager!=null) {

				manager.close();
			}
		}
		return b;
	}

	@Override
	public Users usersLogin(String username, String password, String role) {
		Users user=null;
		EntityManager manager=emf.createEntityManager();
		try {
			manager.getTransaction().begin();
			String query="SELECT u from Users u  Where u.username=:username AND u.password=:password AND u.role=:role";
			TypedQuery<Users> qu=manager.createQuery(query,Users.class);
			qu.setParameter("username", username);
			qu.setParameter("password", password);
			qu.setParameter("role",role);

			user=(Users)qu.getSingleResult();

			manager.getTransaction().commit();
			return user;

		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			if(manager!= null) {
				manager.close();
			}}

		return user;
	}


	@Override
	public boolean bookHotel(BookingDetails bookingdetails) {
		boolean b=false;
		EntityManager manager=null;
		try {
			manager=emf.createEntityManager(); 
			manager.getTransaction().begin();

			manager.persist(bookingdetails);

			b=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			b=false;
		}
		finally
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
		}
		return b;
	}

	@Override
	public boolean addHotel(Hotel hotel) {
		boolean b=false;
		EntityManager manager=null;
		try {
			manager=emf.createEntityManager(); 
			manager.getTransaction().begin();

			manager.persist(hotel);

			b=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			b=false;
		}
		finally
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
		}
		return b;
	}

	@Override
	public boolean deleteHotel(String hotelid) {
		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="delete from Hotel where hotelid=:hotelid";
		Query qu=manager.createQuery(query);
		qu.setParameter("hotelid", hotelid);
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyHotel(Hotel hotel) {
		boolean m=false;
		EntityManager manager = emf.createEntityManager();
		try {
			manager.getTransaction().begin();
			String jq="update Hotel h set  h.city =:city, h.hotel_name=:hotelname, h.address =:address h.description=desc h.avg_rate_pernight=avg h.phone_no1=phoneno1 h.phone_no2=phoneno2 h.rating=rating h.email=email h.fax=fax  where h.hotel_id =:hotelid";
			Query query = manager.createQuery(jq);  
			query.setParameter("city",hotel.getCity());
			query.setParameter("hotelname",hotel.getHotelname());
			query.setParameter("address",hotel.getAddress());
			query.setParameter("description",hotel.getDescription());
			query.setParameter("avg",hotel.getAvgratepernight());
			query.setParameter("phoneno1",hotel.getPhoneno1());
			query.setParameter("phoneno2",hotel.getPhoneno2());
			query.setParameter("rate",hotel.getRating());
			query.setParameter("email",hotel.getPhoneno2());
			query.setParameter("rate",hotel.getRating());
			query.setParameter("fax",hotel.getFax());
			int count=query.executeUpdate();

			manager.getTransaction().commit();
			if(count>0) {
				m = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
			m = false;
		}finally {
			if(manager!= null) {
				manager.close();
			}}

		return m;
	}

	@Override
	public boolean addRoom(RoomDetails roomdetails) {
		boolean ar=false;
		EntityManager manager=null;
		try {
			manager=emf.createEntityManager(); 
			manager.getTransaction().begin();

			manager.persist(roomdetails);

			ar=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ar=false;
		}
		finally
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
		}
		return ar;
	}

	@Override
	public boolean deleteRoom(String roomid) {
		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="delete from RoomDetails where roomid=:roomid";
		Query qu=manager.createQuery(query);
		qu.setParameter("roomid", roomid);
		int count=qu.executeUpdate();
		if(count>0)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyRoom(RoomDetails roomdetails) {
		boolean m=false;
		EntityManager manager = emf.createEntityManager();
		try {
			manager.getTransaction().begin();
			String query="update RoomDetails r set r.hotel_id =:hotel, r.room_no =:roomno, r.room_type=roomtype, r.per_night_rate =:pernightrate r.availability=:availability r.photo=:photo where r.room_id =:roomid";
			Query qu = manager.createQuery(query);  
			qu.setParameter("hotel",roomdetails.getHotelid());
			qu.setParameter("roomno",roomdetails.getRoomno());
			qu.setParameter("roomtype",roomdetails.getRoomtype());
			qu.setParameter("pernightrate",roomdetails.getPernightrate());
			qu.setParameter("availability",roomdetails.getAvailability());


			int count=qu.executeUpdate();

			manager.getTransaction().commit();
			if(count>0) {
				m = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
			m= false;
		}finally {
			if(manager!= null) {
				manager.close();
			}}

		return m;
	}


	@Override
	public List<Hotel> listHotels() {
		EntityManager manager=emf.createEntityManager();
		manager.getTransaction().begin();
		String query="select h from Hotel h";
		Query qu=manager.createQuery(query);
		List<Hotel> list=(List<Hotel>) qu.getResultList();
		if(list!=null)
		{
			if(manager!=null) {
				manager.getTransaction().commit();
				manager.close();
			}
			return list;
		}
		return null;
	}
}

