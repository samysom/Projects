package com.library.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.project.dao.LibraryDAO;
import com.library.project.dao.LibraryDAOImplJPA;
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

@Service
public class LibraryServiceJPAImpl implements LibraryService {

	@Autowired
	LibraryDAOImplJPA li;
	
	LibraryDAO dao=new LibraryDAOImplJPA();

	@Override
	public UserJPA login1(String id, String pass, String role) {
		UserJPA user=dao.login1(id, pass, role);

		if(user!=null) {
			return user;
		}
		return null;
	}

	@Override
	public boolean createUser1(UserJPA us) {
		return dao.createUser1(us);
	}

	@Override
	public BookInventoryJPA registration1(String name) {
		BookInventoryJPA bi=dao.registration1(name);

		if(bi!=null) {
			return bi;
		}
		return null;
	}

	@Override
	public boolean afterRegistration1(BookRegistrationJPA regn) {

		boolean b=dao.afterRegistration1(regn);

		if(b) {
			return true;
		}
		return false;
	}

	@Override
	public List<BookInventoryJPA> listBooks1() {
		List<BookInventoryJPA> li=dao.listBooks1();

		if(li!=null) {

			return li;

		}
		return null;
	}

	@Override
	public boolean addInventory1(BookInventoryJPA b) {

		boolean bl=dao.addInventory1(b);
		if(bl) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateInventory1(String bookId, String bookName) {

		boolean b=dao.updateInventory1(bookId, bookName);

		if(b) {
			return true;
		}
		return false;


	}

	@Override
	public boolean deleteInventory1(String bookid) {

		boolean bl=dao.deleteInventory1(bookid);
		if(bl) {
			return true;
		}
		return false;
	}

	@Override
	public List<BookRegistrationJPA> transaction1() {

		List<BookRegistrationJPA> list=dao.transaction1();
		
		if(list!=null) {

			return list;

		}
		return null;

	}

	@Override
	public boolean issueTransaction1(BookTransactionJPA t) {

		boolean b=dao.issueTransaction1(t);
		
		if(b) {
			return true;
		}
		return false;

	}

	@Override
	public BookTransactionJPA returnTransaction1(String tranId,String id) {

		BookTransactionJPA list=dao.returnTransaction1(tranId, id);
		
		if(list!=null) {

			return list;

		}
		return null;

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



}
