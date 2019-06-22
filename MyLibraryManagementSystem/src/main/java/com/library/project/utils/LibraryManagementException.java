package com.library.project.utils;

public class LibraryManagementException extends Exception {
		
		
		public LibraryManagementException(String message) {
	        super(message);
	    }

		public LibraryManagementException(Throwable cause) {
	        super(cause);
	    }
		

		public LibraryManagementException(int errorCode, String message) {
			super(message);
			
		}
		
	}

