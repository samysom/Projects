package com.asset.jpa.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //To make the class Persistence
@Table(name= "AssetAllocation")  //To declare a table
public class AssetAllocation {
	
	@Id
	@Column(name= "allocationId")
	private String allocationId ;
	
	@Column(name= "assetId")
	private String assetId  ;
	
	@Column(name= "empNo")
	private String empNo ;
	
	@Column(name= "allocationDate")
	private Date allocationDate ;
	
	@Column(name= "releaseDate")
	private Date releaseDate ;
	
	public String getAllocationId() {
		return allocationId;
	}
	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}
	public String getAssetId() {
		return assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public Date getAllocationDate() {
		return allocationDate;
	}
	public void setAllocationDate(Date allocationDate) {
		this.allocationDate = allocationDate;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	

}
