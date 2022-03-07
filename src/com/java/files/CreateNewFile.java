package com.java.files;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) {
		try {
			File myFile = new File("D:\\FilesExample\\firstfile.txt");
			if (myFile.createNewFile()) {
				System.out.println("File Created Successfully " + myFile.getName());
			} else {
				System.out.println("file Already exits!!!!");
			}
		} catch (IOException e) {
			System.out.println("Error While creating the new file ");
			e.printStackTrace();
		}
	}
}
