package com.cisc181.core;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;

public class Enrollment {
	@XmlElement
	private UUID EnrollmentID;
	@XmlElement
	private UUID StudentID; 
	@XmlElement
	private UUID SectionID; 
	@XmlElement
	private double Grade;
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID StudentID, Section SCT){
		this.EnrollmentID = UUID.randomUUID();
		
		this.StudentID = getStudentID();
		this.SectionID = SCT.getSectionID();
	}
	
	public UUID getEnrollmentID(){
		return this.EnrollmentID;
	}
	public double getGrade(){
		return this.Grade;
	}
	
	public void setGrade(double Grade){
		this.getGrade();
	}
	
	public UUID getStudentID(){
		return StudentID;
	}
	
	public void setStudentID(UUID StudentID){
		this.getStudentID();
	}
	
	public UUID getSectionID(){
		return SectionID;
	
	}
}
