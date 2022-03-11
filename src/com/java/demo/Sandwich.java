package com.java.demo;

public class Sandwich implements MenuItem {
	
	private String name;
	private double price;
	
	public Sandwich(String aName,double aPrice) {
		name=aName;
		price=aPrice;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}	
}
