package com.sp.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mind {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		
		Human h = context.getBean("human",Human.class);
		h.startLoving();

	}

}
