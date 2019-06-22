package com.library.project.dao;
import java.util.List;

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
public interface LibraryDAO {

	public User login(String id, String pass,String role);
	public boolean createUser(User us);
	public BookInventory registration(String name);
	public boolean afterRegistration(BookRegistration regn);
	public  List<BookInventory> listBooks();
	public boolean addInventory(BookInventory b);
	public boolean updateInventory(String bookId,String bookName);
	public boolean deleteInventory(String bookid);
	public List <BookRegistration> transaction();
	public boolean issueTransaction(BookTransaction t);
	public List<BookTransaction> returnTransaction(String tranId,String id);
	
	public UserJPA login1(String id, String pass,String role);
	public boolean createUser1(UserJPA us);
	public BookInventoryJPA registration1(String name);
	public boolean afterRegistration1(BookRegistrationJPA regn);
	public  List<BookInventoryJPA> listBooks1();
	public boolean addInventory1(BookInventoryJPA b);
	public boolean updateInventory1(String bookId,String bookName);
	public boolean deleteInventory1(String bookid);
	public List <BookRegistrationJPA> transaction1();
	public boolean issueTransaction1(BookTransactionJPA t);
	public BookTransactionJPA returnTransaction1(String tranId,String id);

	public String createUser2(UserCollection us) throws LibraryManagementException;
	public BookInventoryCollection registration2(int bookId) throws LibraryManagementException;
	public  List<BookInventoryCollection> listBooks2()throws LibraryManagementException;
	public String addInventory2(BookInventoryCollection b)throws LibraryManagementException;
	public String updateInventory2(BookInventoryCollection book)throws LibraryManagementException;
	public String deleteInventory2(int bookid) throws LibraryManagementException;

}


