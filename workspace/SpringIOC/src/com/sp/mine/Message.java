package com.sp.mine;

public class Message implements Whatsapp{

	private String message;
	
	

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void whatsappFunction() {
		
		System.out.println("You have one unread message :" + message);
	
		
	}

}
