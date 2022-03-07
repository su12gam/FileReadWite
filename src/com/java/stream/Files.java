package com.java.stream;

import java.io.*;
public class Files {
	public static void main(String[] args) {
		try {
		File f=new File("D:\\FilesExample\\secondfile.txt");
		f.createNewFile();
		System.out.println("get the absolute path : "+f.getAbsolutePath());
		System.out.println("get the path : "+f.exists());
		System.out.println("get the parent : "+f.getParent());
		System.out.println("get the path : "+f.getAbsolutePath());
		System.out.println("get the file name : "+f.getName());
		
		if (f.exists()) {
			System.out.println("is readable "+f.canRead());
			System.out.println("is writeable "+f.canWrite());
			System.out.println("length of file "+f.length());
			System.out.println("is a directory "+f.isDirectory());
		}
		} catch (IOException e) {
			System.out.println("Error occurred");
		}
	}
}
