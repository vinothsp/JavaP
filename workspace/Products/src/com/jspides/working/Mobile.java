package com.jspides.working;

public class Mobile extends Product {
	String os;
	String brand;
	public Mobile(int pId, double price, String os, String brand) {
		super(pId, price);
		this.os = os;
		this.brand = brand;
	}
	

}
