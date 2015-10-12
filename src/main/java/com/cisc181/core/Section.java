package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import javax.xml.bind.annotation.XmlElement;

public class Section {
	
	@XmlElement
	private UUID CourseID;
	@XmlElement
	private UUID SemesterID; 
	@XmlElement
	private UUID SectionID; 
	@XmlElement
	private int RoomID;

	public Section(Course CID, Semester SID, UUID SectionID, int RoomID){
		this.SectionID = SectionID;
		this.RoomID = RoomID;
		
		this.CourseID = CID.getCourseID();
		this.SemesterID = SID.getSemesterID();
	}

	public UUID getSectionID(){
		return this.SectionID;
	}
	
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	
	public int getRoomID(){
		return this.RoomID;
	}
	
	public void setRoomID(int RoomID){
		this.RoomID = RoomID;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
}
