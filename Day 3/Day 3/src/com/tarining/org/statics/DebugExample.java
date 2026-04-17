package com.tarining.org.statics;

class Example {

	Example() {
		System.out.println("Example Constructor is Called");
	}

	public void myMessage() {
		System.out.println("Welcome to debugging block");
	}
}

public class DebugExample {

	public static void main(String[] args) {

		System.out.println("First line to execute");
		Example e1 = new Example();
		e1.myMessage();
	}

}
