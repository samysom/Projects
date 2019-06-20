package com.airline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.airline.dto.AirportDTO;
import com.airline.dto.BookingInformationDTO;
import com.airline.dto.FlightInformationDTO;
import com.airline.dto.UsersDTO;

@Repository
public class AIrlineDAOImpl implements AirlineDAO{
	
	@PersistenceUnit
	EntityManagerFactory emf;

	@Override
	public UsersDTO LoginUser(String userName, String password, String role) {
		EntityManager entityManager=emf.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			String query="from UsersDTO us where us.userName=:username and us.password=:password and us.role=:role";
			Query qu=entityManager.createQuery(query);
			
			qu.setParameter("username", userName);
			qu.setParameter("password", password);
			qu.setParameter("role", role);
			
			UsersDTO user=(UsersDTO)qu.getSingleResult();
			entityManager.getTransaction().commit();
			entityManager.close();
			return user;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean createUser(UsersDTO user) {
		EntityManager entityManager=emf.createEntityManager();
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(user);
			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}
	
	@Override
	public UsersDTO searchUser(String userName) {
		EntityManager entityManager=emf.createEntityManager();
		try
		{   entityManager.getTransaction().begin();
		
			UsersDTO searchUser=entityManager.find(UsersDTO.class, userName);
			
			entityManager.getTransaction().commit();
			entityManager.close();
			return searchUser;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteUser(String userName) {
		EntityManager entityManager=emf.createEntityManager();
		try
		{
			entityManager.getTransaction().begin();
			UsersDTO removeUser=entityManager.find(UsersDTO.class, userName);
			entityManager.remove(removeUser);
			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(String userName, String password, long mobileNo) {
		EntityManager entityManager=emf.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			
			UsersDTO update =entityManager.find(UsersDTO.class, userName);
			update.setPassword(password);
			update.setMobileNo(mobileNo);

			entityManager.persist(update);

			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean forgotPassword(String userName, String password) {
		EntityManager entityManager=emf.createEntityManager();

		try {
			entityManager.getTransaction().begin();
			UsersDTO forgot =entityManager.find(UsersDTO.class,userName );
			forgot.setPassword(password);

			entityManager.persist(forgot);

			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean addAirport(AirportDTO airportDTO) {
		EntityManager entityManager=emf.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(airportDTO);
			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteAirport(String abbreviation) {
		EntityManager entityManager=emf.createEntityManager();
		try
		{
			entityManager.getTransaction().begin();
			AirportDTO del=entityManager.find(AirportDTO.class, abbreviation);

			entityManager.remove(del);

			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateAirport(String abbreviation, String location, String city, int zipCode) {
		EntityManager entityManager=emf.createEntityManager();

		try {
			entityManager.getTransaction().begin();
			AirportDTO update =entityManager.find(AirportDTO.class,abbreviation );
			update.setLocation(location);
			update.setCity(city);
			update.setZipCode(zipCode);

			entityManager.persist(update);

			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public AirportDTO searchAirport(String abbreviation) {
		EntityManager entityManager=emf.createEntityManager();
		try
		{
			entityManager.getTransaction().begin();
			AirportDTO searchUser=entityManager.find(AirportDTO.class, abbreviation);
			entityManager.getTransaction().commit();
			entityManager.close();
			return searchUser;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addFlight(FlightInformationDTO flightDTO) {
		EntityManager entityManager=emf.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(flightDTO);
			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean updateFlight(String flightNo, String airline, String depDate, String arrDate, String depTime, 
			String arrTime, String depCity, String arrCity, double fare) {
		EntityManager entityManager=emf.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			FlightInformationDTO update =entityManager.find(FlightInformationDTO.class,flightNo);
			update.setAirline(airline);
			update.setDepDate(depDate);
			update.setArrDate(arrDate);
			update.setDepTime(depTime);
			update.setArrTime(arrTime);
			update.setDepCity(depCity);
			update.setArrCity(arrCity);
			update.setFare(fare);

			entityManager.persist(update);

			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteFlight(String flightNo) {
		EntityManager entityManager=emf.createEntityManager();
		try
		{
			entityManager.getTransaction().begin();
			FlightInformationDTO delete=entityManager.find(FlightInformationDTO.class, flightNo);

			entityManager.remove(delete);

			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public FlightInformationDTO searchFlight(String flightNo) {
		EntityManager entityManager=emf.createEntityManager();
		try
		{
			entityManager.getTransaction().begin();
			FlightInformationDTO search=entityManager.find(FlightInformationDTO.class, flightNo);
			entityManager.getTransaction().commit();
			entityManager.close();
			return search;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean booking(BookingInformationDTO bookingDetailsDTO) {
		EntityManager entityManager=emf.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(bookingDetailsDTO);
			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean cancelBooking(long bookingId) {
		EntityManager entityManager=emf.createEntityManager();
		try
		{
			entityManager.getTransaction().begin();
			BookingInformationDTO cancel=entityManager.find(BookingInformationDTO.class, bookingId);

			entityManager.remove(cancel);

			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateBooking(long bookingId, String classType, String srcCity, String destCity) {
		EntityManager entityManager=emf.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			BookingInformationDTO update =entityManager.find(BookingInformationDTO.class,bookingId);
			update.setClassType(classType);
			update.setSrcCity(srcCity);
			update.setDestCity(destCity);

			entityManager.persist(update);

			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<UsersDTO> listUsers() {
		List<UsersDTO> userList=null;
		EntityManager entityManager=emf.createEntityManager();

		entityManager.getTransaction().begin();
		String hql="SELECT user FROM UsersDTO user";
		Query query=entityManager.createQuery(hql);
		try {
			userList = query.getResultList();
			entityManager.getTransaction().commit();
			return userList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}finally {
		entityManager.close();
		}
		return userList;
	}

	@Override
	public List<FlightInformationDTO> listFlights() {
		List<FlightInformationDTO> flightList=null;
		EntityManager entityManager=emf.createEntityManager();

		entityManager.getTransaction().begin();
		String hql="SELECT flight FROM  FlightInformationDTO flight";
		Query query=entityManager.createQuery(hql);
		try {
			flightList = query.getResultList();
			entityManager.getTransaction().commit();
			return flightList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}finally {
			entityManager.close();
		}
		

		return flightList;
	}

	@Override
	public List<BookingInformationDTO> listBookings() {
		List<BookingInformationDTO> bookList=null;
		EntityManager entityManager=emf.createEntityManager();

		entityManager.getTransaction().begin();
		String hql="SELECT booking FROM  BookingInformationDTO booking";
		Query query=entityManager.createQuery(hql);
		try {
			bookList = query.getResultList();
			entityManager.getTransaction().commit();
			return bookList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
		finally {
		entityManager.close();
		}
		return bookList;
	}
}