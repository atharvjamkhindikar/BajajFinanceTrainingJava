package com.training.org.beans;

public class Student implements Comparable<Student> {

	private int age;
	private String name;
	public Student() {
		super();
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
}
