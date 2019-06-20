package com.asset.jpa.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity //To make the class Persistence
@Table (name= "AssetRequest") //To declare a table
public class AssetRequest {

	@Id
	@Column(name= "allocationId")
	private int allocationId;
	
	@Column(name= "assetId")
	private int assetId;
	
	@Column(name= "empNo")
	private int empNo;
	
	@Column(name= "allocationDate")
	private Date allocationDate;
	
	@Column(name= "releaseDate")
	private Date releaseDate;
	
	public int getAllocationId() {
		return allocationId;
	}
	public void setAllocationId(int allocationId) {
		this.allocationId = allocationId;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
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
	@Override
	public String toString() {
		return "AssetRequest [allocationId=" + allocationId + ", assetId=" + assetId + ", empNo=" + empNo
				+ ", allocationDate=" + allocationDate + ", releaseDate=" + releaseDate + "]";
	}
	
	
	
	
	
}
