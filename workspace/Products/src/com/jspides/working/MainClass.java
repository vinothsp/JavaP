package com.jspides.working;

public class MainClass {
	public static void main(String[] args) 
	{
		Store s1=new Store();
		Product p1=s1.create(1);
		s1.display(p1);
		Product p2=s1.create(2);
		s1.display(p2);
		
	}

}
