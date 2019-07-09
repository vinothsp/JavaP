package com.jspides.working;

public class Television extends Product {
	int size;
	String brand;
	public Television(int pId, double price, int size, String brand) {
		super(pId, price);
		this.size = size;
		this.brand = brand;
	}
	

}
