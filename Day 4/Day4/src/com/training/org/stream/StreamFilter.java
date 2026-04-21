package com.training.org.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Amit", "Rahul", "Ankit", "John");

		names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
	}

	
}
