package com.university.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Programs_Scheduled")
public class ProgramsScheduled {
	
	
	@Column(name="Scheduled_program_id")
	private String scheduledProgId;
	@Column(name="ProgramName")
	private String programName;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="start_date")
	private String startDate;
	@Override
	public String toString() {
		return "Programs_Scheduled [scheduledProgId=" + scheduledProgId + ", programName=" + programName + ", location="
				+ location + ", startDate=" + startDate + ", endDate=" + endDate + ", session=" + session + "]";
	}
	public String getScheduledProgId() {
		return scheduledProgId;
	}
	public void setScheduledProgId(String scheduledProgId) {
		this.scheduledProgId = scheduledProgId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getSession() {
		return session;
	}
	public void setSession(int session) {
		this.session = session;
	}
	@Column(name="end_date")
	private String endDate;
	@Id
	@Column(name="sessions_per_week")
	private int session;
	
	
	

	
	
	
	
	
}
