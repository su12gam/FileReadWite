package com.java.recursion;

public class RecursionExample {
	static int count =0;
	public static void method1() {
		count++;
		if (count<=5) {
			System.out.println("hello " +count);
			method1();
		}
	}
	public static void main(String[] args) {
		method1();
	}
}
