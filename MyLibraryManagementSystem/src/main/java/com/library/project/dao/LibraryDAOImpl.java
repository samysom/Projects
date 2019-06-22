package com.library.project.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import com.library.project.dto.*;

import com.library.project.utils.*;


public class LibraryDAOImpl implements LibraryDAO {

	
	java.sql.Statement stmt = null;
	java.sql.PreparedStatement pstmt=null;

	LibraryDAO1 da=new LibraryDAO1();
	URL url = new URL();
	DisplayTransaction display = new DisplayTransaction();
	User us=new User();
	DriverClass d=new DriverClass();
	BookInventory b=new BookInventory();
	BookRegistration regn=new BookRegistration();
	BookTransaction trans=new BookTransaction();
	DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");


	ResultSet rs = null;
	boolean mark=false;
	double fine1= 0.0;
	boolean b2=false;

	@Override
	public User login(String id, String pass,String role){

		try
		{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());

			String query = "select * from Users where user_id = ? and password = ? and role =?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.setString(2,pass);
			pstmt.setString(3, role);

			rs = pstmt.executeQuery();
			if(rs.next())
			{
				String id1 = rs.getString("user_id");
				String Username= rs.getString("user_name");
				String mail= rs.getString("email_id");
				String role1= rs.getString("role");
				us.setUserId(id1);
				us.setUserName(Username);
				us.setEmail(mail);
				us.setRole(role1);

				System.out.println("Logged in");
				return us;

			}
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("not Logged in");
			return null;
		} finally {
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}



	@Override
	public BookInventory registration(String name){
		try {
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());

			String query = "select * from BooksInventory where book_name=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				System.out.println("Book is available in the inventory");
				b.setBookId(rs.getString("book_id"));
				b.setBookName(rs.getString("book_name"));
				b.setAuthor1(rs.getString("author1"));
				b.setAuthor2(rs.getString("author2"));
				b.setPublisher(rs.getString("publisher"));
				b.setYearOfPublication(rs.getString("yearofpublication"));
				return b;
			}else {
				System.out.println("Book is not available in the inventory");
				return null;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("not available"); 
			return null;   
		}
		finally {
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}}catch(Exception e) {
					e.printStackTrace();
				}
		}

	}



	@Override
	public boolean afterRegistration(BookRegistration regn){
		try
		{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());

			String query = "insert into BooksRegistration values(?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,regn.getRegistrationId());
			pstmt.setString(2,regn.getBookId());
			pstmt.setString(3,regn.getUserId());

			java.util.Date d=regn.getRegistrationDate(); 
			pstmt.setDate(4,new java.sql.Date(d.getTime()));
			int count = pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("registered");
				return true;
			}else {
				System.out.println("not registered");
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("not registered"); 
			return false;   
		}
		finally {
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}}catch(Exception e) {
					e.printStackTrace();
				}
		}

	}
	@Override
	public boolean addInventory(BookInventory b) {

		try
		{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());


			String query= "insert into BooksInventory values(?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, b.getBookId());
			pstmt.setString(2, b.getBookName());
			pstmt.setString(3, b.getAuthor1());
			pstmt.setString(4, b.getAuthor2());
			pstmt.setString(5, b.getPublisher());
			pstmt.setString(6, b.getYearOfPublication());

			int count =pstmt.executeUpdate();

			if(count>0) {
				b2= true;   			
			} else {
				b2= false;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}}catch(Exception e) {
					e.printStackTrace();
				}
		}
		return b2;
	}	

	@Override
	public boolean updateInventory(String name, String id) {

		try
		{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());


			String query= "update BooksInventory set book_name=? where book_id=?";
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, name);
			pstmt.setString(2, id);

			int count =pstmt.executeUpdate();

			if(count>0) {
				b2= true;   			
			}else{
				b2= false;
			}

		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}}catch(Exception e) {
					e.printStackTrace();
				}
		}
		return b2;
	}
	@Override
	public boolean deleteInventory(String bookid) {
		try
		{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());

			String query ="delete from  BooksInventory where book_id=?";
			pstmt = con.prepareStatement(query);

			pstmt.setString(1,bookid);


			int count = pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("deleted");
				b2=true;
			}else {
				System.out.println("not deleted");
				b2=false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("not deleted");
			return false;   
		}finally {
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}}catch(Exception e) {
					e.printStackTrace();
				}

		}
		return b2;
	}
	@Override
	public List <BookRegistration> transaction() {
		List<BookRegistration> list=new ArrayList<BookRegistration>();
		try{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());
			String query = "select * from BooksRegistration";

			pstmt = con.prepareStatement(query);
			rs =pstmt.executeQuery();


			while(rs.next())
			{
				BookRegistration regn1=new BookRegistration();
				regn1.setRegistrationId(rs.getString("registration_id"));
				regn1.setBookId(rs.getString("book_id"));
				regn1.setUserId(rs.getString("user_id"));
				regn1.setRegistrationDate(new java.sql.Date(rs.getDate("registrationdate").getTime()));

				list.add(regn1);

			}

			return list;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally{
			
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	}

	@Override
	public boolean issueTransaction(BookTransaction t) {
		try
		{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());


			String query = "insert into BooksTransaction values(?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,t.getTransactionId());
			pstmt.setString(2,t.getRegistrationId());


			System.out.println(t.getIssueDate());
			java.util.Date d1=t.getIssueDate();

			java.util.Date d2=t.getReturnDate();
			pstmt.setDate(3,new java.sql.Date(d1.getTime()));
			pstmt.setDate(4,new java.sql.Date(d2.getTime()));


			pstmt.setDouble(5,fine1);

			int count = pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("Modified");
				return true;
			}else {
				System.out.println("not modified");
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("not modified");
			return false;   
		}
		finally {
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}}catch(Exception e) {
					e.printStackTrace();
				}

		}
	}
	
	
	@Override
	public List<BookTransaction> returnTransaction(String tranId,String regnId) {	
		
		try
		{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());
			List<BookTransaction> list1=new ArrayList<BookTransaction>();
			

			String query = "update BooksTransaction set fine=? where transaction_id=? and registration_id=?";

			pstmt = con.prepareStatement(query);
			double fine=da.fineCalculation(tranId);
			pstmt.setDouble(1, fine);
			System.out.println(fine);
			pstmt.setString(2, tranId);
			pstmt.setString(3, regnId);
			pstmt.executeUpdate();
			System.out.print("Fine is set");
			
			List<BookTransaction> dis1= display.display(tranId);
			list1.addAll(dis1);
					return list1;

		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				
				if(pstmt!=null) {
					pstmt.close();
				}

			}catch(Exception e) {
				e.printStackTrace();
			}
		}


	}

	

	@Override
	public boolean createUser(User us) {
		try
		{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());
			String query= "insert into users values(?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,us.getUserId());
			pstmt.setString(2,us.getUserName());
			pstmt.setString(3,us.getPassword());
			pstmt.setString(4,us.getEmail());
			pstmt.setString(5,us.getRole());

			int count =pstmt.executeUpdate();

			if(count>0) {
				System.out.println("created");
				b2= true;   			
			} else {
				System.out.println("not created1");
				b2= false;
			}

		} catch(Exception e) {
			System.out.println("not created2");
			e.printStackTrace();
			return false;
		}
		finally {
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return b2;
	}

	@Override
	public List<BookInventory> listBooks() {
		List<BookInventory> list1=new ArrayList<BookInventory>();
		
		try{
			Class.forName(d.getDriver());
			Connection con =DriverManager.getConnection(url.getURL());
			String query = "select * from BooksInventory";

			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()){
				BookInventory bi=new BookInventory();
				bi.setBookId(rs.getString("book_id"));
				bi.setBookName(rs.getString("book_name"));
				bi.setAuthor1(rs.getString("author1"));
				bi.setAuthor2(rs.getString("author2"));
				bi.setPublisher(rs.getString("publisher"));
				bi.setYearOfPublication(rs.getString("yearofpublication"));
			
				list1.add(bi);
			}
			System.out.println(list1);
			return list1;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally{
			
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	}



	@Override
	public UserJPA login1(String id, String pass, String role) {
		
		return null;
	}



	@Override
	public boolean createUser1(UserJPA us) {
		
		return false;
	}



	@Override
	public BookInventoryJPA registration1(String name) {
	
		return null;
	}



	@Override
	public boolean afterRegistration1(BookRegistrationJPA regn) {
		
		return false;
	}



	@Override
	public List<BookInventoryJPA> listBooks1() {
		
		return null;
	}



	@Override
	public boolean addInventory1(BookInventoryJPA b) {
		
		return false;
	}



	@Override
	public boolean updateInventory1(String bookId, String bookName) {

		return false;
	}



	@Override
	public boolean deleteInventory1(String bookid) {
		
		return false;
	}



	@Override
	public List<BookRegistrationJPA> transaction1() {
		
		return null;
	}



	@Override
	public boolean issueTransaction1(BookTransactionJPA t) {
		
		return false;
	}



	
	@Override
	public String createUser2(UserCollection us) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public BookInventoryCollection registration2(int bookId) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<BookInventoryCollection> listBooks2() throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String addInventory2(BookInventoryCollection b) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String updateInventory2(BookInventoryCollection book) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String deleteInventory2(int bookid) throws LibraryManagementException {
		// TODO Auto-generated method stub
		return null;
	


	}



	@Override
	public BookTransactionJPA returnTransaction1(String tranId, String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}


