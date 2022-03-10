package com.java.apache.excel.files;

import java.io.IOException;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		WritingExcelFile excel=new WritingExcelFile();
		List<User> listUser=excel.getListUser();
		String excelPath="D:\\FilesExample\\User.xlsx";
		excel.writeExcel(listUser, excelPath);
	}
}
