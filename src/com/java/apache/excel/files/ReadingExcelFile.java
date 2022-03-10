package com.java.apache.excel.files;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {
	static XSSFWorkbook work;
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("D:\\FilesExample\\Book.xlsx"));// creating a file instance & obtaining the bytes of the file.
			work = new XSSFWorkbook(file);// creating workbook instance that refers to .xlsx file
			XSSFSheet sheet = work.getSheetAt(0);// creating a sheet to refer object
			Iterator<Row> itr = sheet.iterator();// iterating over the excel file.
			System.out.println("the given file is ");
			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> celliterator = row.cellIterator();// iterating each column
				while (celliterator.hasNext()) {
					Cell cell = celliterator.next();
					switch (cell.getCellType()) {
					case NUMERIC: {
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					}
					case STRING: {
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					}
					default:
						break;
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			System.out.println("Error occurred: " + e);
		}
	}
}
