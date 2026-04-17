package com.training.org;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {

		// Accept 4 numbers from user and find the maximum number among them

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 numbers : ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("Number " + num1 + " is maximum number ");
		} else if (num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.println("Number " + num2 + " is maximum number ");
		} else if (num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.println("Number " + num3 + " is maximum number ");
		} else {
			System.out.println("Number " + num4 + " is maximum number ");
		}

	}

}
