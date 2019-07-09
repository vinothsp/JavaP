package com.sp.di;

public class StudentMoreDetails {
	
	private int rollNumber;
	private String studentName;
	
	
	public StudentMoreDetails(int rollNumber, String studentName) {
		
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	
	
	void displayStudentDetails()
	{
		System.out.println("Roll No of "+rollNumber+ " is Student name of : "+ studentName);
	}

}
