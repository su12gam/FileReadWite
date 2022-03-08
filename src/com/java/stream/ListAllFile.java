package com.java.stream;

import java.io.File;

public class ListAllFile {
	public static void list(String path) {
		File f=new File(path);
		File[] arr=f.listFiles();
		for (File files : arr) {
			if(files.isFile()) {
				System.out.println("Path of the file is :"+files.getName());
				System.out.println("Length of the file is :"+files.length());
				System.out.println("Parent path :"+files.getParent());
				System.out.println("Absolute Path is :"+files.getAbsolutePath());
				System.out.println("---------------------------------------------");	
			}
			else
			{
				list(files.getAbsolutePath());
			}
		}
	}
	public static void main(String[] args) {
		list("D:\\coding folder");
	}
}
