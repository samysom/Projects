package com.hbms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "Hotel")
public class Hotel {

	@Id
	@Column(name= "hotelid")
	private String hotelid;
	@Column(name= "city")
	private String city;
	@Column(name= "hotelname")
	private String hotelname;
	
	
	
	@Column(name= "address")
	private String address;
	@Column(name= "description")
	private String description;
	@Column(name= "avgratepernight")
	private double avgratepernight;
	@Column(name= "phoneno1")
	private String phoneno1;
	@Column(name= "phoneno2")
	private String phoneno2;
	@Column(name= "rating")
	private String rating;
	@Column(name= "email")
	private String email;
	@Column(name= "fax")
	private String fax;
	public String getHotelid() {
		return hotelid;
	}
	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAvgratepernight() {
		return avgratepernight;
	}
	public void setAvgratepernight(double avgratepernight) {
		this.avgratepernight = avgratepernight;
	}
	public String getPhoneno1() {
		return phoneno1;
	}
	public void setPhoneno1(String phoneno1) {
		this.phoneno1 = phoneno1;
	}
	public String getPhoneno2() {
		return phoneno2;
	}
	public void setPhoneno2(String phoneno2) {
		this.phoneno2 = phoneno2;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	@Override
	public String toString() {
		return "Hotel [hotelid=" + hotelid + ", city=" + city + ", hotelname=" + hotelname + ", address=" + address
				+ ", description=" + description + ", avgratepernight=" + avgratepernight + ", phoneno1=" + phoneno1
				+ ", phoneno2=" + phoneno2 + ", rating=" + rating + ", email=" + email + ", fax=" + fax + "]";
	}
	
	
	}

