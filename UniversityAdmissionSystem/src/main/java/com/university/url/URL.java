package com.university.url;

public class URL {
	
	
	public static String getURL()
	{
		String url = "jdbc:mysql://localhost:3306/uas?user=root&password=root";
		return url;
	}
	public  static String getDriver()
	{
		String url = "com.mysql.cj.jdbc.Driver";
		return url;
	}

	
	public  static String getProperty()
	{
		String url = "C:/Users/ranjith/Desktop/cap_training/prop.properties";
		return url;
	}

}
