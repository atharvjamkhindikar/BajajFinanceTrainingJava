package com.training.org.excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("Employee.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);

		for (Row row : sheet) {
			for (Cell cell : row) {
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				default:
					break;
				}
			}
			System.out.println();
		}
		wb.close();
		fis.close();

	}

}
