package com.training.org.stream;

import java.util.ArrayList;
import java.util.List;

public class SortingObjects {

	public static void main(String[] args) {
		List<Student> slist = new ArrayList<>();
		slist.add(new Student(3, "Ram"));
		slist.add(new Student(1, "Krishna"));
		slist.add(new Student(2, "Amit"));

		slist.sort((s1, s2) -> s1.id - s2.id);
		slist.forEach(s -> System.out.println(s.id + " " + s.name));

	}

}
