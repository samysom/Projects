package com.asset.jpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity            //To make the class Persistence
@Table (name= "Asset")            //To declare a table
public class Asset {
	
	@Id
	@Column(name= "assetId")
	private int assetId;
	
	@Column(name= "assetName")
	private String assetName;
	
	@Column(name= "des")
	private String des;
	
	@Column(name= "quantity")
	private int quantity;
	
	@Column(name= "status")
	private String status;
	
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
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Assetjpa [assetId=" + assetId + ", assetName=" + assetName + ", des=" + des + ", quantity=" + quantity
				+ ", status=" + status + "]";
	}
	
	
	
	
	

}
