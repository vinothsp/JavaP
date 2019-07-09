package org.sp.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		/*
		 * Jio jio = new Jio(); BSNL bsnl = new BSNL();
		 * 
		 * jio.call();
		 * 
		 * bsnl.data();
		 * 
		 * Class instantiation
		 */

		/*
		 * Sim sim = new BSNL();
		 * 
		 * sim.call(); sim.data(); sim.sms();
		 * 
		 * Interface instantiation
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("XML Loaded");

		// Jio j = (org.sp.ioc.Jio) context.getBean("jio");
		Sim sim = context.getBean("sim", Jio.class);
		sim.call();
		sim.data();
		sim.sms();

	}
}
