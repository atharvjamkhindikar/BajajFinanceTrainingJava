package com.org.training.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Organization {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();
		char ch;
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Display EmpList");
			System.out.println("3. Search Employee on Id");
			System.out.println("4. Search Employee on Name");
			System.out.println("5. Delete an Employee");
			System.out.println("6. Update Salary 10%");
			System.out.println("7. Display employees Ascending order of names");
			System.out.println("8. Display employees with more than avg salary");
			System.out.println("9. Dsiplay an Employee with highest Salary");
			System.out.println("10.Sum of all salaries  ");
			System.out.println("11. Exit");
			System.out.println(" Enter Choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println("Enter empId :");
				int id = sc.nextInt();

				System.out.println("Enter Name :");
				String name = sc.next();

				System.out.println("Enter Salary :");
				double salary = sc.nextDouble();

				empList.add(new Employee(id, name, salary));
				System.out.println("Employee Addeed Succeesfully..");
			}
			case 2 -> {
				System.out.println("*******Employee Details*******");
				for (Employee e : empList) {
					System.out.println(e);
				}
			}
			case 3 -> {
				System.out.println("Enter empId to search :");
				int id = sc.nextInt();
				boolean flag = false;
				for (Employee e : empList) {

					if (e.getEmpId() == id) {
						System.out.println(e);
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println("Employee Not Found");
				}
			}
			case 4 -> {
				System.out.println("Enter empName to search :");
				String nm = sc.next();
				boolean flag = false;
				for (Employee e : empList) {

					if (e.getName().equalsIgnoreCase(nm)) {
						System.out.println(e);
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println("Employee Not Found");
				}

			}
			case 5 -> {
				System.out.println("Enter empId to delete");
				int id = sc.nextInt();
				boolean flag = false;
				for (Employee e : empList) {
					if (e.getEmpId() == id) {
						empList.remove(e);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Employee Not Found");
				}
			}
			case 6 -> {
				System.out.println("Update Salary with 10%");
				boolean flag = false;
				for (Employee e : empList) {
					if (e.getBasicSalary() < 30000) {
						e.setBasicSalary(e.getBasicSalary() + 0.10 * (e.getBasicSalary()));
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Employee Not found whose salary is less than 30K");
				}

			}
			case 7 -> {
				Collections.sort(empList,(e1,e2)->
				e1.getName().compareToIgnoreCase(e2.getName()));
				
				empList.forEach(System.out::println);

			}
			}
//			System.out.println("Do you Want to Continue..");
//			ch = sc.next().charAt(0);
		} while (choice != 11);
	}

}
