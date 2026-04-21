package com.training.org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.training.org.beans.Customer;

public class CustomerManagementSystem {

	public static List<Customer> clist = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public static int idCounter = 1;

	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.println("***** Customer Management System *****");
			System.out.println("1. Add Customer");
			System.out.println("2. View All Customers");
			System.out.println("3. Search Customer by ID");
			System.out.println("4. Generate Report");
			System.out.println("5. find Most Valuable Customer");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				System.out.print("Enter Customer Name: ");
				String name = sc.next();
				System.out.print("Enter Customer Email: ");
				String email = sc.next();
				System.out.print("Enter Customer Total Purchase Amount: ");
				double totalPurchase = sc.nextDouble();

				Customer customer = new Customer();
				clist.add(customer);
				System.out.println("Customer added successfully!");
			}
			case 2 -> {
				System.out.println("All Customers:");
				for (Customer c : clist) {
					System.out.println(c);
				}
			}

			case 3 -> {
				System.out.print("Enter Customer ID to search: ");
				int id = sc.nextInt();
				Customer found = null;
				for (Customer c : clist) {
					if (c.getCustId() == id) {
						found = c;
						break;
					}
				}
				if (found != null) {
					System.out.println("Customer Found: " + found);
				} else {
					System.out.println("Customer with ID " + id + " not found.");
				}
			}
			case 4->{
				System.out.println("Generating report...");
				generatecustomerReportExcel();
				System.out.println("Report generated successfully!");
			}
			}

		} while (choice != 6);

	}

	public static void generatecustomerReportExcel() {
	    System.out.println("Generating customer report in Excel...");
	    
	    if(clist.isEmpty()) {
	        System.out.println("No customers to generate report.");
	        return;
	    }
	    
	    // create Workbook and Sheet
	    Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet("Customer_Report");
	    
	    // row Header
	    Row headerRow = sheet.createRow(0);
	    headerRow.createCell(0).setCellValue("Customer ID");
	    headerRow.createCell(1).setCellValue("Customer Name");
	    headerRow.createCell(2).setCellValue("Address");
	    headerRow.createCell(3).setCellValue("Mobile");
	    headerRow.createCell(4).setCellValue("Bill Amount");
	    
	    
		
	}

	
		
	}

