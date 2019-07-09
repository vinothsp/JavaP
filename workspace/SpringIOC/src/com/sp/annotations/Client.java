package com.sp.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cool.xml");
		College c = context.getBean("collegeBean",College.class);
		
		System.out.println("obj "+c);
	}

}
