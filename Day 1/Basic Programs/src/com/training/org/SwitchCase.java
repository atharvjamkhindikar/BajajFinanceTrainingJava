package com.training.org;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);	
		
		
		char ch;
		do {
			System.out.println("Enter the Month :");		
			int month=sc.nextInt();
		switch(month)
		{
		case 1 :
			System.out.println("Month is January");
		   break;
		case 2:
			System.out.println("Month is February");
			break;
			default :
				System.out.println("Wrong Choice ");
		}
		System.out.println("Do you Want to Continue :");
		ch=sc.next().charAt(0);
	}while(ch=='y' ||ch=='Y');
		
		System.out.println("Thank you ");
	}
}
