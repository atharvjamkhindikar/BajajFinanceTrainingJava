package com.training.org.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpdateExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("Employee.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);

		Row row = sheet.getRow(1);
		row.getCell(2).setCellValue(70000); // update salary

		FileOutputStream fos = new FileOutputStream("Employee.xlsx");
		wb.write(fos);

		wb.close();
		fis.close();
		fos.close();

		System.out.println("Excel updated!");
		
//		Cell total = row.createCell(3);
//		total.setCellFormula("C2*12"); // yearly salary

	}

}
