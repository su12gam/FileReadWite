package com.java.recursion;

class Recursion{
	public static int method2(int n) {
		if (n==1) {
			return 1;
		}else {
		return (n*method2(n-1));
		}
	}
}
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Factorial is "+Recursion.method2(5));
	}
}
