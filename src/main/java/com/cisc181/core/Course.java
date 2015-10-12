package com.cisc181.core;


import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

public class Course {
	
	@XmlElement
	private UUID CourseID;
	@XmlElement
	private String CourseName; 
	@XmlElement
	private int GradePoints; 
	
	
	public void setCourseID(UUID CourseID){
		this.CourseID = CourseID;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	
	public int getGradePoints(){
		return GradePoints;
	}
	
	public void setGradePoints(int GradePoints){
		this.GradePoints = GradePoints;
	}

	public Course(UUID CourseID, String CourseName, int GradePoints){
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
	}
}
