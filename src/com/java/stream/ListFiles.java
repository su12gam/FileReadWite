package com.java.stream;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File file=new File("D:\\FilesExample");
		String[] files=file.list();
		for (String string : files) {
			System.out.println(string);
		}
	}
}
