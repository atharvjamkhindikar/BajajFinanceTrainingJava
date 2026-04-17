package com.training.org;

import java.util.Scanner;

public class CalcFunctions {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int choice;
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		do {
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				CalcFunctions.Addition(num1, num2, num3);
				break;

			case 2:
				CalcFunctions.Subtraction(num1, num2);
				break;

			case 3:
				CalcFunctions.Multiplication(num1, num2, num3);
				break;

			case 4:
				CalcFunctions.Division(num2, num3);
				break;

			default:
				System.out.println("Enter a Valid Response");
			}
			System.out.println("Do you want to continue ?");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Thank you Visit Again...");
	}

	public static double Division(int num2, int num3) {
		double result = num2 / num3;
		System.out.println("Division of "+num2+"and"+num3+" = "+result);
		return result;

	}

	public static int Multiplication(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		System.out.println("Multiplication of "+num1+" and "+num2+" and "+num3+" = "+result);
		return result;

	}

	public static int Subtraction(int num1, int num2) {
		int result = num2 - num1;
		System.out.println("Substraction of "+num2+" and "+num1+" = "+result);
		return result;

	}

	public static int Addition(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("Addition of "+num1+" and "+num2+" and "+num3+" = "+result);
		return result;

	}

}
