package com.sp.valuereq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beansy.xml");
		Student s = context.getBean("student",Student.class);
		s.display();
		

	}

}
