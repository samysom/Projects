package com.library.project.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="booksregistration")
public class BookRegistrationJPA {
	@Id
	@Column(name="registration_id")
	private String registrationId;
	@Column(name="book_id")
	private String bookId;
	@Column(name="user_id")
	private String userId;
	@Column(name="registrationdate")
	private Date registrationDate;
	
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		return "BookRegistration [registrationId=" + registrationId + ", bookId=" + bookId + ", userId=" + userId
				+ ", registrationDate=" + registrationDate + "]";
	}
	
	
	
}
