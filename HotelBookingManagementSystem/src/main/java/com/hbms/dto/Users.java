
package com.hbms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "User")
public class Users {

	@Id
	@Column(name= "userid")
	
	private String userid;
	@Column(name= "password")
	private String password;
	@Column(name= "role")
	
	
	
	
	private String role;
	@Column(name= "username")
	private String username;
	@Column(name= "mobileno")
	private String mobileno;
	@Column(name= "phone")
	private String phone;
	@Column(name= "address")
	private String address;
	@Column(name= "email")
	private String email;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", password=" + password + ", role=" + role + ", username=" + username
				+ ", mobileno=" + mobileno + ", phone=" + phone + ", address=" + address + ", email=" + email + "]";
	}
	
	
	
}

