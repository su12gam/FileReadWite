package com.java.stream;

import java.io.File;
import java.util.Scanner;

public class SearchFiles {
	static Scanner sc;

	public static void Search(String name, File file){
		
		File[] folder = file.listFiles();
		if (folder != null) {
			for (File f : folder) {
				if (f.isDirectory()) {
					Search(name, f);
				} else if (name.equalsIgnoreCase(f.getName())) {
					System.out.println(f.getParentFile());
				}
			}
		}
	}
	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("Enter the file name :");
		String name = sc.next();
		System.out.println("Enter the directory from where to search");
		String directory = sc.next();
		Search(name, new File(directory));
	}
}
