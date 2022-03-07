package com.java.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		try {
			File myFile = new File("D:\\FilesExample\\firstfile.txt");
			Scanner myReader = new Scanner(myFile);
			while (myReader.hasNextLine()){
				String dataString = myReader.nextLine();
				System.out.println(dataString);
			}
			myReader.close();
		} catch (IOException e) {
			System.out.println("Error occurred while reading the file.....");
			e.printStackTrace();
		}
	}
}
