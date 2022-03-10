package com.java.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args){
		Model u1=new Model(1, "Ram", "Rajasthan", 24);
		Model u2=new Model(2, "Nilesh", "Andheri", 21);
		Model u3=new Model(3, "Austin", "gundavali", 23);
		Model u4=new Model(4, "Akash", "Mumbai", 15);
		List<Model> list=Arrays.asList(u1,u2,u3,u4);
		
		Collections.sort(list, new NameComparator());;
		for (Model model : list) {
			System.out.println(model.toString());
		}
		System.out.println("------------------------------------------------------------------------------------");
		Collections.sort(list, new AgeComparator());
		for (Model model : list) {
			System.out.println(model.toString());
		}
		
	}
}	
