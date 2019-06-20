package com.airline.dto;

import java.sql.Date;

public class FlightInformationDTO 
{
	private String flightNo;
	private String airline;
	private String depCity;
	private String arrCity;
	private Date depDate;
	private Date arrDate;
	private int firstSeats;
	private int firstSeatFare;
	private int bussSeats;
	private int bussSeatsFare;
	
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDepCity() {
		return depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	public Date getDepDate() {
		return depDate;
	}
	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}
	public Date getArrDate() {
		return arrDate;
	}
	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}
	public int getFirstSeats() {
		return firstSeats;
	}
	public void setFirstSeats(int firstSeats) {
		this.firstSeats = firstSeats;
	}
	public int getFirstSeatFare() {
		return firstSeatFare;
	}
	public void setFirstSeatFare(int firstSeatFare) {
		this.firstSeatFare = firstSeatFare;
	}
	public int getBussSeats() {
		return bussSeats;
	}
	public void setBussSeats(int bussSeats) {
		this.bussSeats = bussSeats;
	}
	public int getBussSeatsFare() {
		return bussSeatsFare;
	}
	public void setBussSeatsFare(int bussSeatsFare) {
		this.bussSeatsFare = bussSeatsFare;
	}
	
	@Override
	public String toString() {
		return "FlightInformationDTO [flightNo=" + flightNo + ", airline=" + airline + ", depCity=" + depCity
				+ ", arrCity=" + arrCity + ", depDate=" + depDate + ", arrDate=" + arrDate + ", firstSeats=" + firstSeats + ", firstSeatFare=" + firstSeatFare
				+ ", bussSeats=" + bussSeats + ", bussSeatsFare=" + bussSeatsFare + "]";
	}
	
	
		
}

