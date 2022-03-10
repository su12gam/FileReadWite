package com.java.apache.commons.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.LineIterator;

public class FileReadingExample {
	static BufferedReader bf;
	static File file;
	public static void readUsingIOUtils() throws IOException {
			bf=new BufferedReader(new FileReader("D:\\FilesExample\\secondfile\\New folder\\New folder\\2\\txt.txt"));
			String line;
			while ((line=bf.readLine())!=null) {
				System.out.println(line);
			}		
	}
	public static void usingFileFeilds() throws IOException {
		file=FileUtils.getFile("D:\\FilesExample\\secondfile\\New folder\\New folder\\2\\txt.txt");
		LineIterator iter=FileUtils.lineIterator(file);
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void getFileNames() {
		System.out.println("Getting the full path of the file: "+FilenameUtils.getFullPath("D:\\FilesExample\\secondfile\\New folder\\New folder\\2\\txt.txt"));
		System.out.println("Getting the extension of the file: "+FilenameUtils.getExtension("D:\\FilesExample\\secondfile\\New folder\\New folder\\2\\txt.txt"));
		System.out.println("After removing the extension: "+FilenameUtils.removeExtension("D:\\FilesExample\\secondfile\\New folder\\New folder\\2\\txt.txt"));
		System.out.println("getting the name of the file: "+FilenameUtils.getName("D:\\FilesExample\\secondfile\\New folder\\New folder\\2\\txt.txt"));
		System.out.println("getting the base name of the file: "+FilenameUtils.getBaseName("D:\\FilesExample\\secondfile\\New folder\\New folder\\2\\txt.txt"));
	}
	public static void checkingParentDirectory() throws IOException {
		file=FileUtils.getFile("D:\\FilesExample");
		File folder=FileUtils.getFile("txt.txt");
		System.out.println("parent directory contains txt file: " +FileUtils.directoryContains(file, folder));	
	}
	public static void main(String[] args) throws IOException {
//		readUsingIOUtils();
//		usingFileFeilds();
//		getFileNames();
		checkingParentDirectory();
	}
}	
