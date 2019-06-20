package com.university.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Programs_Offered")
public class ProgramsOffered {
	
	
	@Column(name="ProgramName")
	private String programName;
	@Column(name="description")
	private String description;
	@Column(name="applicant_eligibility")
	private String eligibility;
	@Column(name="duration")
	@Id
	private int duration;
	@Column(name="degree_certificate_offered")
	private String degCerti;
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDegCerti() {
		return degCerti;
	}
	public void setDegCerti(String degCerti) {
		this.degCerti = degCerti;
	}
	@Override
	public String toString() {
		return "Programs_offered [programName=" + programName + ", description=" + description + ", eligibility="
				+ eligibility + ", duration=" + duration + ", degCerti=" + degCerti + "]";
	}
	
	
	

}
