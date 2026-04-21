package com.training.org.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 2, 8, 1);

		Collections.sort(list, (a, b) -> a - b);

		System.out.println(list);
	}

}
