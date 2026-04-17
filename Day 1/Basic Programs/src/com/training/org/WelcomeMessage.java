package com.training.org;

import java.io.IOException;

import javax.swing.JOptionPane;


public class WelcomeMessage {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//		int num = 10;
//		System.out.println("Welcome to Java Programming");
//		System.out.print("New Message ");
//		System.out.format("%d ", num);
//		System.err.print(" Error ");
//      
//		String uName ="Hamza";
//		
//		System.out.println("\nValues are "+uName +" "+num);

		int empId;
		String empName;
		double salary;

//	1st Traditional Way 		
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter empId :");
//		empId=Integer.parseInt(input.readLine());
//		
//		System.out.println("Enter UserName : ");
//		empName=input.readLine();
//		
//		System.out.println("Enter Salary :");
//		salary=Double.parseDouble(input.readLine());
//		System.out.println("\nEmployee Details are\nempId:- "+empId+"\nEmpName:- "+empName+"\nSalary:- "+salary);

		// 2nd Way Scanner

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter empId :");
//		empId = sc.nextInt();
//
//		System.out.println("Enter Name :");
//		empName = sc.next();
//
//		System.out.println("Enter Salary :");
//		salary = sc.nextDouble();
//
//		System.out.println(
//				"\nEmployee Details are\nempId:- " + empId + "\nEmpName:- " + empName + "\nSalary:- " + salary);

		
		// 3rd Way to accept values from a user 
		
		empId=Integer.parseInt(JOptionPane.showInputDialog("Enter empId"));
		empName=JOptionPane.showInputDialog("Enter your name");
		salary=Double.parseDouble(JOptionPane.showInputDialog("Enter Salary"));

		JOptionPane.showMessageDialog(null,"The Values are  \nempId "+empId+" \nName "+empName+" \nSalary "+salary);
		
		
	}
}
