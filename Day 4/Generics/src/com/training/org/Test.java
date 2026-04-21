package com.training.org;

public class Test {

	static <T> void print(T value) {
		System.out.println(value);
	}

	public static void main(String[] args) {

		//		Box<String> box1 = new Box<>();
//		box1.set("Hello");
//		System.out.println(box1.get());
//
//		Box<Integer> box2 = new Box<>();
//		box2.set(100);
//		System.out.println(box2.get());
//
//		Box<Double> box3 = new Box<>();
//		box3.set(3.14);
//		System.out.println(box3.get());

		print("Hello");
		print(100);
		print(3.14);
	}

}
