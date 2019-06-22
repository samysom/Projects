package com.library.project.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.library.project.dto.*;


import com.library.project.utils.LibraryManagementException;
import com.library.project.utils.LibraryUtility;

public class LibraryDAOCollection implements LibraryDAO{

	
	private final static Logger LOGGER = Logger.getLogger(LibraryDAOCollection.class.getName());
	private static Map<Integer, BookInventoryCollection> bookMap =  new HashMap<>();
	private static Map<Integer, UserCollection> userMap =  new HashMap<>();
	@Override
	public String createUser2(UserCollection us) throws LibraryManagementException {
		try {
			userMap.put(us.getUserId(), us);
			return "success";

		} catch (Exception e) {
			LOGGER.severe("Exception in create user : " + e.getMessage());
			throw new LibraryManagementException(e.getMessage());
		}
	}



	@Override
	public BookInventoryCollection registration2(int bookId) throws LibraryManagementException {
		BookInventoryCollection book = null;

		try {
			book = bookMap.get(bookId);

		} catch (Exception e) {
			LOGGER.severe("Exception in get book : " + e.getMessage());
			throw new LibraryManagementException(e.getMessage());
		}
		return book;
	}



	@Override
	public List<BookInventoryCollection> listBooks2() throws LibraryManagementException {
		return bookMap.values().stream().collect(Collectors.toList());
	}



	@Override
	public String addInventory2(BookInventoryCollection b) throws LibraryManagementException {
		try {
			bookMap.put(b.getBookId(), b);			 
		} catch (Exception e) {
			LOGGER.severe("Exception in create book : " + e.getMessage());
			throw new LibraryManagementException(e.getMessage());
		}return "success";
	}



	@Override
	public String updateInventory2(BookInventoryCollection book) throws LibraryManagementException {
		
		try {

			BookInventoryCollection oldBook = bookMap.get(book.getBookId());
			book = com.library.project.utils.LibraryUtility.copyBookUpdatedFields(oldBook, book);

			bookMap.replace(book.getBookId(), oldBook, book);
		} catch (Exception e) {
			LOGGER.severe("Exception in update book : " + e.getMessage());
			throw new LibraryManagementException(e.getMessage());
		}	
		return "success";
	}

	@Override
	public String deleteInventory2(int bookid) throws LibraryManagementException {
		try {
			bookMap.remove(bookid);
		} catch (Exception e) {
			LOGGER.severe("Exception in delete book : " + e.getMessage());
			throw new LibraryManagementException(e.getMessage());
		}return "success";
	}

	@Override
	public User login(String id, String pass, String role) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean createUser(User us) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public BookInventory registration(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean afterRegistration(BookRegistration regn) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public List<BookInventory> listBooks() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean addInventory(BookInventory b) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean updateInventory(String bookId, String bookName) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean deleteInventory(String bookid) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public List<BookRegistration> transaction() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean issueTransaction(BookTransaction t) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public List<BookTransaction> returnTransaction(String tranId, String id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public UserJPA login1(String id, String pass, String role) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean createUser1(UserJPA us) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public BookInventoryJPA registration1(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean afterRegistration1(BookRegistrationJPA regn) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public List<BookInventoryJPA> listBooks1() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean addInventory1(BookInventoryJPA b) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean updateInventory1(String bookId, String bookName) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean deleteInventory1(String bookid) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public List<BookRegistrationJPA> transaction1() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean issueTransaction1(BookTransactionJPA t) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public BookTransactionJPA returnTransaction1(String tranId, String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
