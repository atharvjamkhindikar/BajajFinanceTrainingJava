package com.training.org.exceptions;

public class TryCatchExample {

	public static void main(String[] args) {

		try {
			int num1 = 100;
			int num2 = 0;
			int result = num1 / num2; // This will throw ArithmeticException
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) { // specific Exception
			System.out.println("Cannot divide by zero. Please provide a non-zero divisor.");
			// e.printStackTrace();

		}

		catch (Exception e) // generic Exception
		{
			System.out.println("An unexpected error occurred: " + e.getMessage());
			// e.printStackTrace();
		} finally {
			System.out.println("This block will always execute, regardless of exceptions.");
		}

		System.out.println("Program continues after the try-catch block.");
	}

}
