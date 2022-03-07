package com.java.files;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File myFile=new File("D:\\\\FilesExample\\\\firstfile.txt");
		if (myFile.delete()) {
			System.out.println("File Deleted Successfully!!!!");
		}else {
			System.out.println("Failed to delete the file");
		}
	}
}
