package com.java.stream;

import java.io.File;

public class ListAllFiles {
	public static void listFil(String path) {
		File f=new File(path);
		File[] folder=f.listFiles();
		for (File files : folder) {
			if (files.isFile()) {
				System.out.println("Path of the file is :"+files.getName());
				System.out.println("Length of the file is :"+files.length());
				System.out.println("Parent path :"+files.getParent());
				System.out.println("Absolute Path is :"+files.getAbsolutePath());
				System.out.println("---------------------------------------------");	
			}else {
				listFil(files.getPath());
			}
		}
	}
	public static void main(String[] args) {
		listFil("D:\\FilesExample");
	}
}