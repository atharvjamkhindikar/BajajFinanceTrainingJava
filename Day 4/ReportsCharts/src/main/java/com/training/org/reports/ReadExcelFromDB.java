package com.training.org.reports;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.training.org.beans.Employee;

public class ReadExcelFromDB {

	public static void main(String[] args) throws SQLException, IOException {

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amj", "root", "root");

		// fetching employees from Databse
		List<Employee> elist = fetchEmployeeFromDB(conn);

		// Writing employee data to excel
		writeEmployeeToExcel(elist);

		conn.close();

		System.out.println("✓ Data successfully fetched and stored in Excel!");

	}

	public static void writeEmployeeToExcel(List<Employee> elist) throws IOException {
	
		Workbook wb=new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Employees");
		
		// header row 
		Row header=sheet.createRow(0);
		header.createCell(0).setCellValue("ID");
		header.createCell(1).setCellValue("Name");
		header.createCell(2).setCellValue("Salary");	
		
		// Create data rows 
		int rowNum=1;
		for(Employee emp :elist)
		{
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(emp.getId());
			row.createCell(1).setCellValue(emp.getName());
			row.createCell(2).setCellValue(emp.getSalary());
//			rowNum++;
		}
		
		FileOutputStream fos=new FileOutputStream("Employees.xlsx");
		wb.write(fos);
		
		fos.close();
		wb.close();
		System.out.println("✓ Employee data written to Employees.xlsx");
	}

	public static List<Employee> fetchEmployeeFromDB(Connection conn) throws SQLException {
		List<Employee> elist = new ArrayList<>();

		String sql = "select * from Employee";

		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");

			Employee emp = new Employee(id, name, salary);
			elist.add(emp);

			System.out.println("Fetched " + emp);
		}
		rs.close();
		ps.close();

		return elist;
	}

}
