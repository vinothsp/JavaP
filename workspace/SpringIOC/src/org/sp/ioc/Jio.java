package org.sp.ioc;

public class Jio implements Sim {
//
//	public static void main(String[] args) {
//		
//
//	}

	
	public Jio() {
		System.out.println("JIO INVOKED");
	}
	
	
	
	@Override
	public void call() {
		
		System.out.println("Calling with Jio");
	}

	

	@Override
	public void data() {
		
		System.out.println("Broowsing with Jio");
	}

	@Override
	public void sms() {
		System.out.println("SMS using Jio");
		
	}

}
