package com.org.training.abstraction;

public abstract class Employee {

	protected String name;
	protected int id;

	public Employee() {
		super();
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public abstract double calculateSalary();

	public void displayInfo() {
		System.out.println("Id: " + id + " Name: " + name + " Salary: " + calculateSalary());
	}

}

class FullTimeEmployee extends Employee {
	private double monthlySalary;

	public FullTimeEmployee(String name, int id, double montlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}

}

class Intern extends Employee {

	private double hourlyRate;
	private int hoursWorked;

	public Intern(String name, int id, double hourlyRate, int hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {

		return hourlyRate * hoursWorked;
	}

}

class Main {
	public static void main(String[] args) {

		Employee ft = new FullTimeEmployee("Eshan", 101, 5000);
		Employee intern = new Intern("Tanish", 102, 20, 80);

		ft.displayInfo();
		intern.displayInfo();
	}
}