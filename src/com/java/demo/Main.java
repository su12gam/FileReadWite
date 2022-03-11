package com.java.demo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the meal name:");
		String itemName=sc.next();
		
		
		Sandwich cheese=new Sandwich("Cheese Burger", 2.52);
		Sandwich pizza=new Sandwich("Pepperoni pizza", 3.2);
		Salad cucumber=new Salad("Cucumber Salad",2.9);
		Salad Tomato=new Salad("Tomato Salad",3.0);
		Drink coke=new Drink("Coke", 0.5);
		Drink pepsi=new Drink("Pepsi", 0.8);
		Trio tri=new Trio(cheese, Tomato, pepsi);
		System.out.println("The Trio Meal contains: "+tri.getName());
		System.out.println("Price of Trio Meal: "+tri.getPrice());
		Trio to=new Trio(pizza, cucumber, coke);
		System.out.println("The Trio Meal contains: "+to.getName());
		System.out.println("Price of Trio Meal: "+to.getPrice());
	}
}
