package com.java.recursion;

import java.util.Scanner;

public class FibonacciSeries {
	static int n1=0,n2=1,n3=0;
	static Scanner sc;
	static void fibbo(int count) {
		if (count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			fibbo(count-1);
		}
	}
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Enter the number to get the fibbonacci series :");
		int count=sc.nextInt();
		fibbo(count);
	}
}
