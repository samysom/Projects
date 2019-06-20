package com.airline.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class FlightInformationDTO {
	
		@Id
		@Column(name="flightNo")
		private String flightNo;
		@Column(name="airline")
		private String airline ;
		@Column(name="depDate")
		private String depDate ;
		@Column(name="arrDate")
		private String arrDate ;
		@Column(name="depTime")
		private String depTime ;
		@Column(name="arrTime")
		private String arrTime ;
		@Column(name="depCity")
		private String depCity ;
		@Column(name="arrCity")
		private String arrCity ;
		@Column(name="fare")
		private double fare;
		
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
		public String getDepDate() {
			return depDate;
		}
		public void setDepDate(String depDate) {
			this.depDate = depDate;
		}
		public String getArrDate() {
			return arrDate;
		}
		public void setArrDate(String arrDate) {
			this.arrDate = arrDate;
		}
		public String getDepTime() {
			return depTime;
		}
		public void setDepTime(String depTime) {
			this.depTime = depTime;
		}
		public String getArrTime() {
			return arrTime;
		}
		public void setArrTime(String arrTime) {
			this.arrTime = arrTime;
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
		public double getFare() {
			return fare;
		}
		public void setFare(double fare) {
			this.fare = fare;
		}
		
		@Override
		public String toString() {
			return "FlightInformationDTO [flightNo=" + flightNo + ", airline=" + airline + ", depDate=" + depDate
					+ ", arrDate=" + arrDate + ", depTime=" + depTime + ", arrTime=" + arrTime + ", depCity=" + depCity
					+ ", arrCity=" + arrCity + ", fare=" + fare + "]";
		}

		}
