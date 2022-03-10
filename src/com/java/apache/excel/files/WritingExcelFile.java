package com.java.apache.excel.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.java.comparator.NameComparator;

public class WritingExcelFile {
	/**
	 * @param listUser
	 * @param excelPath
	 * @throws IOException
	 */
	public void writeExcel(List<User> listUser,String excelPath)throws IOException {
		XSSFWorkbook work=new XSSFWorkbook();
		XSSFSheet sheet=work.createSheet("User");
		
		CellStyle cellStyle=sheet.getWorkbook().createCellStyle();
		Font font=sheet.getWorkbook().createFont();
		font.setBold(true);
		font.setItalic(true);
		cellStyle.setFont(font);
		sheet.createFreezePane(0,1);
		sheet.createFreezePane(1,1);
		Row row1=sheet.createRow(0);
		
		Cell cellTitle=row1.createCell(0);
		cellTitle.setCellStyle(cellStyle);
		cellTitle.setCellValue("ID");
		
		Cell cellTitle1=row1.createCell(1);
		cellTitle1.setCellStyle(cellStyle);
		cellTitle1.setCellValue("Name");
		
		
		Cell cellTitle2=row1.createCell(2);
		cellTitle2.setCellStyle(cellStyle);
		cellTitle2.setCellValue("Address");
		
		Cell cellTitle3=row1.createCell(3);
		cellTitle3.setCellStyle(cellStyle);
		cellTitle3.setCellValue("Age");
		
		
//		cellTitle3.setCellFormula("SUM(D2:D5)");
		Row row2=sheet.createRow(5);
		Cell cell5=row2.createCell(0);
		cell5.setCellValue("Total");
		cell5.setCellStyle(cellStyle);
		Cell cell4=row2.createCell(3);
		cell4.setCellFormula("Sum(D2:D5)");
		
		int rowCount=1;
		for (User u : listUser) {
			Row row=sheet.createRow(rowCount++);
			writeUser(u,row);
		}
		try {
			FileOutputStream outputStream=new FileOutputStream(excelPath);
			work.write(outputStream);
			System.out.println("Successfully written");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void writeUser(User u,Row row) {
		Cell cell=row.createCell(0);
		cell.setCellValue(u.getId());
		
		Cell cell1=row.createCell(1);
		cell1.setCellValue(u.getName());
		
		Cell cell2=row.createCell(2);
		cell2.setCellValue(u.getAddress());
		
		Cell cell3=row.createCell(3);
		cell3.setCellValue(u.getAge());
		
	}
	public List<User> getListUser(){
		User user1=new User(1, "Sugam", "Andheri", 24);
		User user2=new User(2, "Anshul", "Gundavali", 3);
		User user3=new User(3, "where", "hey", 5);
		User user4=new User(4, "what", "how", 6);
		List<User> listUser=Arrays.asList(user1,user2,user3,user4);
		Collections.sort(listUser,new NameCompare());
		return listUser;
	}
}
