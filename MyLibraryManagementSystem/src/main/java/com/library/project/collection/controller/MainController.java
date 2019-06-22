package com.library.project.collection.controller;

import java.util.List;

import com.library.project.dto.BookInventoryCollection;
import com.library.project.dto.UserCollection;
import com.library.project.service.LibraryService;
import com.library.project.service.LibraryServiceCollectionImpl;

public class MainController {
	public static void main(String[] args) {
		LibraryService lib = new LibraryServiceCollectionImpl();
		
		try {
			UserCollection u=new UserCollection(103, "Veru2","abc@gmail.com", "1", "user");
			String s=lib.createUser2(u);
			System.out.println(s);
			
			BookInventoryCollection book = new BookInventoryCollection(1, "Programming in C", "Yashwant", "Kandelkar", "schand", "2012");
			String s1=lib.addInventory2(book);
			System.out.println(s1);
			
			BookInventoryCollection book1 = new BookInventoryCollection(2, "Programming in C", "Yashwant", "Kandelkar", "schand", "2012");
			String s3=lib.addInventory2(book);
			System.out.println(s3);
			
			BookInventoryCollection response = lib.registration2(1);
			System.out.println("Book : " + response);
			
			List<BookInventoryCollection> list = lib.listBooks2();
			System.out.println("Borrowed Books details : " + list);
			
			BookInventoryCollection book2 = new BookInventoryCollection(1, "Programming", "Arihant", "co", "Arihant Publication", "2013");
			String s2=lib.updateInventory2(book1);
			System.out.println(s2);
			
			String s4=lib.deleteInventory2(2);
			System.out.println(s4);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
