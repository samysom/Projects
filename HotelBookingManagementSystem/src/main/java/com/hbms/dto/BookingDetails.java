package com.hbms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "BookingDetails")

public class BookingDetails {
	
	@Id
	@Column(name= "bookingid")
	private String bookingid;
	@Column(name= "roomid")
	private String roomid;
	@Column(name= "userid")
	private String userid;
	@Column(name= "bookedfrom")
	private String bookedfrom;
	@Column(name= "bookedto")
	private String bookedto;
	@Column(name= "noofadults")
	private double noofadults;
	@Column(name= "noofchildren")
	private double noofchildren;
	@Column(name= "amount")
	private double amount;
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBookedfrom() {
		return bookedfrom;
	}
	public void setBookedfrom(String bookedfrom) {
		this.bookedfrom = bookedfrom;
	}
	public String getBookedto() {
		return bookedto;
	}
	public void setBookedto(String bookedto) {
		this.bookedto = bookedto;
	}
	public double getNoofadults() {
		return noofadults;
	}
	public void setNoofadults(double noofadults) {
		this.noofadults = noofadults;
	}
	public double getNoofchildren() {
		return noofchildren;
	}
	public void setNoofchildren(double noofchildren) {
		this.noofchildren = noofchildren;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
		
		
	}
	@Override
	public String toString() {
		return "BookingDetails [bookingid=" + bookingid + ", roomid=" + roomid + ", userid=" + userid + ", bookedfrom="
				+ bookedfrom + ", bookedto=" + bookedto + ", noofadults=" + noofadults + ", noofchildren="
				+ noofchildren + ", amount=" + amount + "]";
	}
	
}
	
	
	               
		