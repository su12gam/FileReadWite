package com.java.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchFiles {
	static Scanner sc;
	static BufferedReader br;
	
	public static void search(String name, File file,String word) throws IOException {
		File[] folder = file.listFiles();
		if (folder != null) {
			for (File f : folder) {
				if (f.isDirectory()) {
					search(name, f,word);
				} else if (name.equalsIgnoreCase(f.getName())) {
					br=new BufferedReader(new FileReader(f));
					String line;
					while ((line=br.readLine()) != null) {
						if (line.contains(word)) {
							System.out.println(f.getParentFile());
							System.out.println(line);
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		System.out.println("Enter the file name :");
		String name = sc.next();
		System.out.println("Enter the directory from where to search");
		String directory = sc.next();
		System.out.println("Enter word to check whether the file contains entered word or not :");
		String word=sc.next();
		search(name, new File(directory),word);
	}
}