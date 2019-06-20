package com.airline.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class BookingInformationDTO {
		
		@Id 
		@Column(name="bookingId")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long bookingId;
		@Column(name="custEmail")
		private String custemail;
		@Column(name="nopassangers")
		private int noPassangers;
		@Column(name="classtype")
		private String classType;
		@Column(name="totalfare")
		private int totalFare;
		@Column(name="SeatNo")
		private long SeatNo;
		@Column(name="paymentMode")
		private String paymentMode;
		@Column(name="flightno")
		private String flightno;
		@Column(name="srcCity")
		private String srcCity;
		@Column(name="destCity")
		private String destCity;
		
		public String getDestCity() {
			return destCity;
		}
		public void setDestCity(String destCity) {
			this.destCity = destCity;
		}
		public long getBookingId() {
			return bookingId;
		}
		public void setBookingId(long bookingId) {
			this.bookingId = bookingId;
		}
		public String getCustemail() {
			return custemail;
		}
		public void setCustemail(String custemail) {
			this.custemail = custemail;
		}
		public int getNoPassangers() {
			return noPassangers;
		}
		public void setNoPassangers(int noPassangers) {
			this.noPassangers = noPassangers;
		}
		public String getClassType() {
			return classType;
		}
		public void setClassType(String classType) {
			this.classType = classType;
		}
		public int getTotalFare() {
			return totalFare;
		}
		public void setTotalFare(int totalFare) {
			this.totalFare = totalFare;
		}
		public long getSeatNo() {
			return SeatNo;
		}
		public void setSeatNo(long seatNo) {
			SeatNo = seatNo;
		}
		public String getPaymentMode() {
			return paymentMode;
		}
		public void setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
		}
		public String getFlightno() {
			return flightno;
		}
		public void setFlightno(String flightno) {
			this.flightno = flightno;
		}
		public String getSrcCity() {
			return srcCity;
		}
		public void setSrcCity(String srcCity) {
			this.srcCity = srcCity;
		}
		
		@Override
		public String toString() {
			return "BookingInformationDTO [bookingId=" + bookingId + ", custemail=" + custemail + ", noPassangers="
					+ noPassangers + ", classType=" + classType + ", totalFare=" + totalFare + ", SeatNo=" + SeatNo
					+ ", paymentMode=" + paymentMode + ", flightno=" + flightno + ", srcCity=" + srcCity + ", destCity="
					+ destCity + "]";
		}
}
		
		