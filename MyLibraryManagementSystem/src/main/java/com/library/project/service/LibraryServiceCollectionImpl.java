package com.library.project.service;

import java.util.List;

import com.library.project.dao.LibraryDAO;
import com.library.project.dao.LibraryDAOCollection;
import com.library.project.dto.BookInventory;
import com.library.project.dto.BookInventoryCollection;
import com.library.project.dto.BookInventoryJPA;
import com.library.project.dto.BookRegistration;
import com.library.project.dto.BookRegistrationJPA;
import com.library.project.dto.BookTransaction;
import com.library.project.dto.BookTransactionJPA;
import com.library.project.dto.User;
import com.library.project.dto.UserCollection;
import com.library.project.dto.UserJPA;

import com.library.project.utils.LibraryManagementException;

public class LibraryServiceCollectionImpl implements LibraryService{

	UserCollection u=null;
	BookInventoryCollection response=null ;
		LibraryDAO bookDao = new LibraryDAOCollection();
		
		
		@Override
		public String createUser2(UserCollection us) throws LibraryManagementException {
			bookDao.createUser2(us);
			return "success";
		}
		@Override
		public BookInventoryCollection registration2(int bookId) throws LibraryManagementException {
			response =bookDao.registration2(bookId);
			return response;
		}
		@Override
		public List<BookInventoryCollection> listBooks2() throws LibraryManagementException {
			List<BookInventoryCollection>b=bookDao.listBooks2();
			return b;
		}
		@Override
		public String addInventory2(BookInventoryCollection b) throws LibraryManagementException {
			bookDao.addInventory2(b);
			return "success";
		}
		@Override
		public String updateInventory2(BookInventoryCollection book) throws LibraryManagementException {
			bookDao.updateInventory2(book);
			return "success";
		}
		@Override
		public String deleteInventory2(int bookid) throws LibraryManagementException {
			
		bookDao.deleteInventory2(bookid);
			return "success";
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
		public BookInventory registration(String id) {
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
