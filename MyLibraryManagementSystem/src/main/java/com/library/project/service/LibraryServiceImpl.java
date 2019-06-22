package com.library.project.service;

import java.util.List;

import com.library.project.dao.LibraryDAO;
import com.library.project.dao.LibraryDAOImpl;
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

public class LibraryServiceImpl implements LibraryService {

	LibraryDAO impl= new LibraryDAOImpl();
	@Override
	public User login(String id, String pass,String role) {
		
		
		User log = impl.login(id,pass,role);
		return log;
		
	}

	@Override
	public boolean afterRegistration(BookRegistration regn) {
		
		boolean result = impl.afterRegistration(regn);
		if(result)
		{
			return true;
		}
		return false;
	}

	
	@Override
	public BookInventory registration(String id) {
		BookInventory r= impl.registration(id);
		if(r!=null) {
			return r;
		}
		return null;
	}




	@Override
	public List<BookInventory> listBooks(){
		
		List<BookInventory> t=impl.listBooks();
		if(t!=null) {
			return t;
		}
		return null;
	}




	@Override
	public List<BookRegistration> transaction() {
	
		List<BookRegistration> t=impl.transaction();
		if(t!=null) {
			return t;
		}
		return null;
	}




	@Override
	public boolean addInventory(BookInventory b) {
	
		boolean result = impl.addInventory(b);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean updateInventory(String name, String id) {
		
		boolean result = impl.updateInventory(name,id);
		if(result)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteInventory(String bookid) {
		
		boolean result = impl.deleteInventory(bookid);
		if(result)
		{
			return true;
		}
		return false;
	}

	

	@Override
	public boolean issueTransaction(BookTransaction t) {
		
		boolean result = impl.issueTransaction(t);
		if(result)
		{
			return true;
		}
		return false;
	}


	@Override
	public List<BookTransaction> returnTransaction(String tranId, String id) {
		List<BookTransaction> t=impl.returnTransaction(tranId,id);
		if(t!=null) {
			return t;
		}
		return null;
	}


	@Override
	public boolean createUser(User us) {
	
		boolean result=impl.createUser(us);
		if(result)
		{
			return true;
		}
		return false;
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