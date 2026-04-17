package com.training.org;

import java.util.Scanner;

public class FourDigits {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 4 Digit Number :");       
		int num=Integer.parseInt(sc.findInLine("\\d{1,4}"));
		
		System.out.println("Number is "+num);
		
		
		
		
//		num=num/10;
//		System.out.println("Last Digit is "+num);
		
		
		
//		num=num%10;
//		System.out.println("3rd Digit is "+num);
//		
//		num=num%10;
//		System.out.println("2nd Digit is "+num);
//		
//		num=num%10;
//		System.out.println("1st Digit is "+num);
//		
		
		
		

}
}
