package com.library.project.repository;

public class CommonConstants {
	// to restrict object creation from outside
		private CommonConstants() {}
		
		
	// table creation query string
		public static final String CREATE_TABLE_USER = "CREATE TABLE IF NOT EXISTS USER(userid int primary key, username varchar(35),"
				+ "emailid varchar(30), password varchar(35), role varchar(30))";
		public static final String CREATE_TABLE_BOOK_INVENTORY = "CREATE TABLE IF NOT EXISTS BOOKINVENTORY(bookid int primary key, bookname varchar(255),"
				+ "author1 varchar(35), author2 varchar(35), publisher varchar(30), yearofpublication varchar(30))";
		
		
		// insert, select, update, delete query string
		//insert
		public static final String INSERT_USER_QUERY = "INSERT INTO USER(userid, username, emailid, password, role) values(?, ?, ?, ?, ?)";
		public static final String INSERT_BOOK_INVENTORY_QUERY = "INSERT INTO BOOKINVENTORY(bookid, bookname, author1, author2, publisher, yearofpublication) values(?, ?, ?, ?, ?, ?)";

		//select
		public static final String SELECT_PARTICULAR_BOOK_INVENTORY_QUERY = "SELECT * from BOOKINVENTORY WHERE bookid= ?";
		public static final String SELECT_ALL_BOOK_INVENTORY_QUERY = "SELECT * from BOOKINVENTORY";
		
		//delete
		public static final String DELETE_BOOK_INVENTORY_QUERY = "DELETE FROM BOOKINVENTORY where bookid = ?";
		
		//update
		public static final String UPDATE_BOOK_INVENTORY_QUERY = "UPDATE BOOKINVENTORY SET bookname = ?, author1 = ?, author2 = ?, publisher = ?, yearofpublication = ? where bookid = ?";
		
		
		// application common constants
		public static final String PROPERTIES_FILE_URL  = "resources/application.properties";
		
		
		// database connection constants
		public static final String DATABASE_KEY = "database";
		public static final String CONNECTION_KEY = "dbConnection";
		public static final String USER_NAME_KEY = "dbUser";
		public static final String USER_PASSWORD_KEY = "dbPassword";	
}

