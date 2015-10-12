package com.cisc181.core;

import java.util.Date;
import java.io.*;

public class PersonException extends Exception {
	private Date DOB; 
	private String phone_number;
	
	public PersonException(Date DOB, String phone_number){
		this.DOB = DOB;
		this.phone_number = phone_number;
	}
	
	public Date getDOB(){
		return DOB;
	}
	
	public String getPhone_number(){
		return phone_number;
	}
}
