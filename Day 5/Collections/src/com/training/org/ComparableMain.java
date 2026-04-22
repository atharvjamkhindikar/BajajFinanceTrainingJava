package com.training.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.org.beans.Student;

public class ComparableMain {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student(22, "Atharv"));
		students.add(new Student(21, "Akshay"));
		students.add(new Student(23, "Aditya"));

		Collections.sort(students);

		for (Student s : students) {
			System.out.println(s);
		}

	}

}
