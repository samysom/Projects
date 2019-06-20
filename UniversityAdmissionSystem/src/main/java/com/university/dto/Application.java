package com.university.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Application")
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Application_id")
	private long applicId;
	@Column(name="full_name")
	private String fullName;
	@Column(name="date_of_birth")
	private String dob;
	@Column(name="highest_qualification")
	private String qualification;
	@Column(name="marks_obtained")
	private int marks;
	@Column(name="goals")
	private String goals;
	@Column(name="email_id")
	private String email;
	@Column(name="Scheduled_program_id")
	private String scheduledProgId;
	@Column(name="status")
	private String status;
	@Column(name="Date_Of_Interview")
	private String interviewDate;
	
	public long getApplicId() {
		return applicId;
	}
	public void setApplicId(long applicId) {
		this.applicId = applicId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getScheduledProgId() {
		return scheduledProgId;
	}
	public void setScheduledProgId(String scheduledProgId) {
		this.scheduledProgId = scheduledProgId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}
	@Override
	public String toString() {
		return "Application [applicId=" + applicId + ", fullName=" + fullName + ", dob=" + dob + ", qualification="
				+ qualification + ", marks=" + marks + ", goals=" + goals + ", email=" + email + ", scheduledProgId="
				+ scheduledProgId + ", status=" + status + ", interviewDate=" + interviewDate + "]";
	}

	
	
	

}
