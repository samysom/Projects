package com.library.project.dto;

public class UserCollection {
	private int userId;
	private String userName;
	private String email;
	private String password;
	private String role;
	
	public UserCollection(int id, String name, String email, String password, String role) {
		this.userId = id;
		this.userName = name;
		this.email = email;
		this.password = password;
		this.role = role;
	
	}
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "LibraryDtoUser [userId=" + userId + ", userName=" + userName + ", email=" + email + ", role=" + role
				+ "]";
	}
	
	
}
