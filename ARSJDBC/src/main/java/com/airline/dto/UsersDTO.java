package com.airline.dto;

public class UsersDTO 
{
	private String userName;
	private String password;
	private String role;
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
		return "UsersDTO [userName=" + userName + ", password=" + password + ", role=" + role + ", mobileNo=" + mobileNo
				+ "]";
	}
}
