package com.training.org.statics;

class CounterClass {

	private static int counter = 0;
	private String name;
	private int age;

	public CounterClass() {
		counter += 1;
		name = "Eshan";
		age = 15;
	}

	public static void count() {
		System.out.println("Total Number of Objects are " + counter);
	}

}

public class StaticCounter {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("value of i is "+i);
		}
//		CounterClass c1 = new CounterClass();
//		CounterClass c2 = new CounterClass();
//		CounterClass c3 = new CounterClass();
//		CounterClass c4 = new CounterClass();
//
//		CounterClass.count();
	}
}
