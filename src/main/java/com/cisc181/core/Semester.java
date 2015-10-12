package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import javax.xml.bind.annotation.XmlElement;

public class Semester {
	
	@XmlElement
	private UUID SemesterID;
	@XmlElement
	private Date StartDate; 
	@XmlElement
	private Date EndDate; 
	
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public Date getStartDate(){
		return StartDate;
	}
	
	public void setStartDate(Date StartDate){
		this.StartDate = StartDate;
	}
	
	public Date getEndDate(){
		return EndDate;
	}
	
	public void setEndDate(Date EndDate){
		this.EndDate = EndDate;
	}
	
	public Semester(UUID SemesterID, Date StartDate, Date EndDate){ 
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

}
