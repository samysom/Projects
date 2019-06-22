package com.library.project.utils;

import com.library.project.dto.BookInventoryCollection;


public class LibraryUtility {
	public static BookInventoryCollection copyBookUpdatedFields(BookInventoryCollection source, BookInventoryCollection target) {

		if (target.getAuthor1() == null) {
			target.setAuthor1(source.getAuthor1());
		}
		if (target.getBookName() == null) {
			target.setBookName(source.getBookName());}
		
		if (target.getAuthor2() == null) {
			target.setAuthor2(source.getAuthor2());
		}

		if (target.getPublisher() == null) {
			target.setPublisher(source.getPublisher());
		}

		if (target.getYearOfPublication() == null) {
			target.setYearOfPublication(source.getYearOfPublication());
		}
		if (target.getBookId() == 0) {
			target.setBookId(source.getBookId());
		}

		return target;
	}
	
}
