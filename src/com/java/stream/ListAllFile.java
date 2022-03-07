package com.java.stream;

import java.io.File;

public class ListAllFile {
	public static void list(String path) {
		File f=new File(path);
		File[] arr=f.listFiles();
		for (File files : arr) {
			if(files.isFile()) {
				System.out.println(files.getName());
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
