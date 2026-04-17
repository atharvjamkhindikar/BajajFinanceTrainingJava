package com.training.org;

import java.util.Scanner;
import java.util.Arrays;

public class StringandArrays02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] names = { "Hamza", "S.P Choudhary", "Jameel", "Yalina", "Aalam", "Donga", "Rehman Dakait", "level", "bob" };
		int choice;
		
		do {
			System.out.println("\n===== NAMES MANAGEMENT SYSTEM =====");
			System.out.println("1. Display names starting with specific character");
			System.out.println("2. Search for a particular name");
			System.out.println("3. Replace a name");
			System.out.println("4. Find palindrome names");
			System.out.println("5. Display all names in ascending order");
			System.out.println("6. Append new friend");
			System.out.println("7. Capitalize names starting with lowercase letters");
			System.out.println("8. Find name with minimum letters");
			System.out.println("9. Find name with maximum letters");
			System.out.println("10. Display all names");
			System.out.println("11. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // consume newline
			
			switch (choice) {
			case 1 -> displayStartingWith(names);
			case 2 -> searchName(names);
			case 3 -> names = replaceName(names);
			case 4 -> findPalindromes(names);
			case 5 -> displayInAscendingOrder(names);
			case 6 -> names = appendName(names);
			case 7 -> names = capitalizeStartingLetters(names);
			case 8 -> findMinimumLetters(names);
			case 9 -> findMaximumLetters(names);
			case 10 -> System.out.println("Current Names: " + Arrays.toString(names));
			case 11 -> System.out.println("Thank you!");
			default -> System.out.println("Invalid choice!");
			}
		} while (choice != 11);
	}

	// Case 1: Display names starting with specific character (Case Sensitive)
	static void displayStartingWith(String[] names) {
		System.out.println("Enter character to search: ");
		String ch = sc.nextLine().trim();
		if (ch.length() == 0) {
			System.out.println("Invalid input!");
			return;
		}
		
		System.out.println("\nNames starting with '" + ch + "':");
		boolean found = false;
		for (String name : names) {
			if (name.startsWith(ch)) {
				System.out.println("  " + name);
				found = true;
			}
		}
		if (!found) {
			System.out.println("  No names found!");
		}
	}

	// Case 2: Search for a particular name (Case Sensitive)
	static void searchName(String[] names) {
		System.out.println("Enter name to search: ");
		String searchName = sc.nextLine().trim();
		
		boolean found = false;
		for (String name : names) {
			if (name.equals(searchName)) {
				System.out.println("\n✓ Name '" + searchName + "' FOUND in the list!");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("\n✗ Name '" + searchName + "' NOT FOUND!");
		}
	}

	// Case 3: Replace a name (Case Sensitive)
	static String[] replaceName(String[] names) {
		System.out.println("Enter name to replace: ");
		String oldName = sc.nextLine().trim();
		
		boolean found = false;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(oldName)) {
				System.out.println("Name '" + oldName + "' found!");
				System.out.println("Enter new name: ");
				String newName = sc.nextLine().trim();
				names[i] = newName;
				System.out.println("✓ Name replaced successfully!");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("✗ Name not found!");
		}
		return names;
	}

	// Case 4: Find palindrome names
	static void findPalindromes(String[] names) {
		System.out.println("\nPalindrome names in the list:");
		boolean found = false;
		for (String name : names) {
			String cleaned = name.replaceAll(" ", "").toLowerCase();
			if (cleaned.equals(new StringBuilder(cleaned).reverse().toString())) {
				System.out.println("  " + name + " (palindrome: " + cleaned + ")");
				found = true;
			}
		}
		if (!found) {
			System.out.println("  No palindrome names found!");
		}
	}

	// Case 5: Display all names in ascending order
	static void displayInAscendingOrder(String[] names) {
		String[] sorted = names.clone();
		Arrays.sort(sorted);
		System.out.println("\nNames in ascending order:");
		for (String name : sorted) {
			System.out.println("  " + name);
		}
	}

	// Case 6: Append new friend
	static String[] appendName(String[] names) {
		System.out.println("Enter name to append: ");
		String newName = sc.nextLine().trim();
		
		String[] newNames = Arrays.copyOf(names, names.length + 1);
		newNames[names.length] = newName;
		System.out.println("✓ Name '" + newName + "' added successfully!");
		return newNames;
	}

	// Case 7: Find names with lowercase starting letters and capitalize them
	static String[] capitalizeStartingLetters(String[] names) {
		System.out.println("\nNames with lowercase starting letters:");
		boolean found = false;
		for (int i = 0; i < names.length; i++) {
			if (Character.isLowerCase(names[i].charAt(0))) {
				System.out.println("  Before: " + names[i]);
				names[i] = Character.toUpperCase(names[i].charAt(0)) + names[i].substring(1);
				System.out.println("  After:  " + names[i]);
				found = true;
			}
		}
		if (!found) {
			System.out.println("  All names already start with capital letters!");
		}
		return names;
	}

	// Case 8: Find name with minimum letters
	static void findMinimumLetters(String[] names) {
		String minName = names[0];
		for (String name : names) {
			if (name.length() < minName.length()) {
				minName = name;
			}
		}
		System.out.println("\nName with minimum letters:");
		System.out.println("  Name: " + minName);
		System.out.println("  Length: " + minName.length() + " characters");
	}

	// Case 9: Find name with maximum letters
	static void findMaximumLetters(String[] names) {
		String maxName = names[0];
		for (String name : names) {
			if (name.length() > maxName.length()) {
				maxName = name;
			}
		}
		System.out.println("\nName with maximum letters:");
		System.out.println("  Name: " + maxName);
		System.out.println("  Length: " + maxName.length() + " characters");
	}
}
