package com.asset.jpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //To make the class Persistence
@Table (name= "Request")   //To declare a table
public class Request {

	
	@Id
	@Column(name= "empNo")  
	private int empNo;
	
	@Column(name= "assetId") 
	private int assetId;
	
	@Column(name= "assetName") 
	private String assetName;
	
	@Column(name= "quantity") 
	private int quantity;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Requestjpa [empNo=" + empNo + ", assetId=" + assetId + ", assetName=" + assetName + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
