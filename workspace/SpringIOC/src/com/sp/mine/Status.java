package com.sp.mine;

public class Status implements Whatsapp {
	
	private String message;
	
	

	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public void whatsappFunction() {
		
		System.out.println("Someone updated status : "+message);
		
		
	}

}
