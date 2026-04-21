package com.training.org.lambda;

public class Test {

	public static void main(String[] args) {

		// Lambda With functional Interface

		MyInterface obj = () -> System.out.println("Hello Lambda !");

		obj.sayHello();
	}

}
