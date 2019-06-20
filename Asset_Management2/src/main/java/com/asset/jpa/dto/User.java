package com.asset.jpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //To make the class Persistence
@Table (name= "User") //To declare a table
public class User {

	@Id
	@Column(name= "userId")
	private int userId;
	
	@Column(name= "userName")
	private String userName;
	
	@Column(name= "password")
	private String password;
	
	@Column(name= "usertype")
	private String usertype;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", usertype=" + usertype + "]";
	}
	
	
	
	
	
}
