package com.training.org.lambda;

import java.util.HashMap;
import java.util.Map;

public class MapLambada {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Java");
		map.put(2, "Pyhton");
		// whenever there is an (->) arrow it is an lambda expression

		map.forEach((key, value) -> System.out.println(key + "->" + value));
	}

}
