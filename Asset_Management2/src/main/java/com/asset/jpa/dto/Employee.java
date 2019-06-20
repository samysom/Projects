package com.asset.jpa.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //To make the class Persistence
@Table(name= "Employee")   //To declare a table
public class Employee {

	@Id
	@Column(name= "empNo") 
	private int empNo;
	
	@Column(name= "ename") 
	private String ename;
	
	@Column(name= "job") 
	private String job;
	
	@Column(name= "mgr") 
	private int mgr;
	
	@Column(name= "hireDate") 
	private Date hireDate;
	
	@Column(name= "deptId") 
	private int deptId;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hireDate="
				+ hireDate + ", deptId=" + deptId + "]";
	}
	
	
	
	
}
