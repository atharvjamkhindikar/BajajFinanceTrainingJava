package com.training.org;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayExamples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] names = { "Hamza", "S.P Choudhary", "Jameel", "Yalina", "Aalam", "Donga", "Rehman Dakait" };
		char ch;
		int choice;
		do {
			System.out.println("1.Search Name");
			System.out.println("2.Replace Name");
			System.out.println("1.Dsiplay Names Staring with ");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				boolean flag = false;
				System.out.println("Enter Name to Search :");
				String name = sc.next();
				for (String str : names) {
					if (str.equals(name)) {
						System.out.println("Name Found in the List");
						flag = true;
						break;
					}

				}
				if (!flag) {
					System.out.println("Oops Name not found in the list...!");
				}

			}

			case 2 -> {
				System.out.println("Enter name to be Replaced ");
				String nm = sc.next();
				
				boolean flag = false;
				int replacePosition = -1;
				for (int i = 0; i < names.length; i++) // traditional for loop for index based operations
				{
					if (names[i].equals(nm)) {
						System.out.println("Name is found in the list ");
					   flag=true;
					   replacePosition=i;
					   
					   break;
					}
				}
				//System.out.println( Arrays.toString(names));
				if(!flag)
				{
					System.err.println("oops name is not found in the list");
				}
				else {
					System.out.println("Enter Name which has to be replaced:");
					String nm2 = sc.next();
					names[replacePosition] = nm2;
					System.out.println("Updated Names: " + Arrays.toString(names));
				}

			}
			case 3->{
				System.out.println("Enter Character to find the name with :");
				
			}

			}
			System.out.println("Do you want to continue ?");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'y');

	}
}
