package com.library.project.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.library.project.dto.BookTransaction;

public class DisplayTransaction {

	
	
		public List <BookTransaction> display(String tranId) {
			List<BookTransaction> list=new ArrayList<BookTransaction>();
			BookTransaction tran= new BookTransaction();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Database?user=root&password=root");
				String query = "select * from BooksTransaction where transaction_id =?";

				java.sql.PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, tranId);
				java.sql.ResultSet rs =pstmt.executeQuery();


				while(rs.next())
				{
					tran.setTransactionId(rs.getString("transaction_id"));
					tran.setRegistrationId(rs.getString("registration_id"));
					tran.setIssueDate(new java.sql.Date(rs.getDate("issue_date").getTime()));
					tran.setReturnDate(new java.sql.Date(rs.getDate("return_date").getTime()));
					tran.setFine(rs.getDouble("fine"));
					list.add(tran);

				}
				
				return list;
			}catch(Exception e)
			{
				e.printStackTrace();
				return null;
			}
			
			}
	}
	

