package com.library.project.utils;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.library.project.dto.BookRegistration;

public class LibraryDAO1 {
	
	public double fineCalculation (String Tranid) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		double fine1=0;
		
		BookRegistration b=new BookRegistration();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Database?user=root&password=root");


			String query = "select return_date from BooksTransaction where transaction_id =?";
			java.sql.PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, Tranid);
			System.out.println(Tranid);
			ResultSet rs = pstmt.executeQuery();
			java.sql.Date d11=null;
			if(rs.next()) {
				 d11=rs.getDate("return_date");
				 System.out.println(d11);
				b.setRegistrationDate(d11);
				
			}
			java.util.Date d12=(java.util.Date)d11;
			Calendar current= Calendar.getInstance();
			java.util.Date c= new Date((current.getTime()).getTime());
			System.out.println(c);
			long diff=c.getTime()-d12.getTime();
			System.out.println(c);
			int days= (int) diff/(1000*60*60*24);
			System.out.println(days);
			
				if((days)>0){
					fine1=days;
					return fine1;}
				
			else {
				fine1=0;
				return fine1;
			}

		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {


		}

		
	}
}
