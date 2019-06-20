package com.airline.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UsersDTO {
	@Id
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	@Column(name="mobileno")
	private long mobileNo;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Users [userName=" + userName + ", password=" + password + ", role=" + role + ", mobileNo=" + mobileNo
				+ "]";
	}

}
