package org.sp.ioc;

public class BSNL implements Sim {
//
//	public static void main(String[] args) {
//		
//
//	}

	@Override
	public void call() {
		
		System.out.println("Calling with BSNL");
	}

	@Override
	public void data() {
		
		System.out.println("Broowsing with BSNL");
	}

	@Override
	public void sms() {
		System.out.println("SMS using BSNL");
		
	}

}
