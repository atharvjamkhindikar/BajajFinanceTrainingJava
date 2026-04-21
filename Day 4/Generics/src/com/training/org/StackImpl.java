package com.training.org;

public class StackImpl {

	public static void main(String[] args) {

		GenericStack<Integer> intStack = new GenericStack<>();
//		intStack.push(10);
//		intStack.push(20);
//		intStack.display();
//		intStack.isEmpty();
//		intStack.size();
//		intStack.pop();
//		intStack.peek();

		GenericStack<String> stringStack = new GenericStack<>();
		stringStack.push("Hello");
		stringStack.push("World");

		stringStack.display();
		System.out.println(stringStack.size());

	}

}
