package com.sp.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = context.getBean("student",Student.class);
		s.displayStudentDetails();
	
		StudentMoreDetails s1 = context.getBean("studentMoreDetails",StudentMoreDetails.class);
		s1.displayStudentDetails();
		

	}

}
