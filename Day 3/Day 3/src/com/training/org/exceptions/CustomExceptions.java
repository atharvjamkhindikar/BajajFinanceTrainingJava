package com.training.org.exceptions;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomExceptions {

	static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("You are underage");
		} else {
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(16);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
