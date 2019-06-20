 package com.airline.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airport")
public class AirportDTO {

	@Id
	@Column(name="abbreviation")
	private String abbreviation;
	@Column(name="airportname")
	private String airportName;
	@Column(name="location")
	private String location;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="zipCode")
	private int zipCode;

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "AirportDTO [abbreviation=" + abbreviation + ", airportName=" + airportName + ", location=" + location
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
}
