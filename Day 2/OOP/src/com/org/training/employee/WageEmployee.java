package com.org.training.employee;

public class WageEmployee extends Employee {

	private String month;
	private int hours;
	private double wages;

	public WageEmployee() {
		super();
	}

	public WageEmployee(int empId, String name, double basicSalary, String month, int  hours,double wages) {
		super(empId, name, basicSalary);
		this.month = month;
		this.wages=wages;
		this.hours=0;
	}

	public String getMonth() {
		return month;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getHours() {
		return hours;
	}

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}



//	public void calculateWages() {
//		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("May")
//				|| month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")
//				|| month.equalsIgnoreCase("October") || month.equalsIgnoreCase("December"))
//			this.wages = this.getHours() * 31;
//		else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June")
//				|| month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November"))
//			this.wages = this.getHours() * 30;
//		else if( month.equalsIgnoreCase("February") )
//			this.wages = this.getHours() * 28;   // not calculating for leap year
//
//	}
	
	
	 public void calculateSalary()
	 {
		 double perDaySalary;
		 double perHourSalary;
		 
		 int noOfDaysInMonth=30;
		 
		 perDaySalary=super.getBasicSalary()/noOfDaysInMonth;
		 
		 perHourSalary=perDaySalary/8;
		 
		 this.wages=perHourSalary*this.hours*28;		 
		 
	 }

	@Override
	public String toString() {
		return super.toString() +" WageEmployee [month=" + month + ", hours=" + hours + ", wages=" + wages+"]";
	}
	 
	 
	
}
