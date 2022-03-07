package com.java.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try{
			FileWriter myWriter=new FileWriter("D:\\FilesExample\\firstfile.txt");
			myWriter.write("My first file has been created on my local system.");
			myWriter.close();
			System.out.println("Successfully written the file!!!");
		} catch (IOException e) {
			System.out.println("error occured while creating the file :");
			e.printStackTrace();
		}
	}
}
