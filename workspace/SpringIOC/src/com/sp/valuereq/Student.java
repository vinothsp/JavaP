package com.sp.valuereq;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	@Value("${student.name}")
	private String studentName;
	
	@Value("${student.course}")
	private String course;
	
	@Value("${student.qualification}")
	private String qualification;
	
	
	
	public void display()
	{
		System.out.println("Student Name is "+studentName);
		System.out.println("Course Intererested is "+course);
		System.out.println("Student qualification is "+qualification);
	}
	
	

}
