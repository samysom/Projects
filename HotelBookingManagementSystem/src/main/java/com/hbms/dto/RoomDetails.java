package com.hbms.dto;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "RoomDetails")
public class RoomDetails {
	@Id
	@Column(name= "hotelid")
	private String hotelid;
	@Column(name= "roomid")
	private String roomid;
	@Column(name= "roomno")
	private String roomno;
	@Column(name= "roomtype")
	private String roomtype;
	@Column(name= "perrate")
	private double pernightrate;
	@Column(name= "availbility")
	private String availability;
	
	public String getHotelid() {
		return hotelid;
	}
	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public double getPernightrate() {
		return pernightrate;
	}
	public void setPernightrate(double pernightrate) {
		this.pernightrate = pernightrate;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	

	@Override
	public String toString() {
		return "RoomDetails [hotelid=" + hotelid + ", roomid=" + roomid + ", roomno=" + roomno + ", roomtype="
				+ roomtype + ", pernightrate=" + pernightrate + ", availability=" + availability +  "]";
	}
	
		
}
