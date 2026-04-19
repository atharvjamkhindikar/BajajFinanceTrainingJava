package com.training.org.statics;

public class StaticBlockExample {

	static int num;
	static {
		num = 100;
		System.out.println("Calling Static Block Before Main Function");
	}

	public static void main(String[] args) {
		System.out.println("Main Function is Called ");
		System.out.println("Value of num is " + num);

	}

}
