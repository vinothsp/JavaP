package com.sp.di;

public class Student {
	
	String studentName;



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	void displayStudentDetails()
	{
		System.out.println("Student name is : "+ studentName);
	}

}
