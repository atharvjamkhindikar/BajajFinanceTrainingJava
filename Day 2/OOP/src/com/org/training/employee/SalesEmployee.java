package com.org.training.employee;

public class SalesEmployee extends Employee {

	private int sales;
	private double commission;
	private double netSalary;

	public SalesEmployee() {
		super();
	}

	public SalesEmployee(int sales, int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);
		this.sales = sales;
		this.commission = 0;
		this.netSalary = 0;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}


	public void calculateSalary() {
		if (sales < 5000)
			this.commission = 0.05 * super.getBasicSalary();
		else if (sales >= 5000 && sales < 10000)
			this.commission = 0.10 * super.getBasicSalary();
		else if (sales >= 10000 && sales < 15000)
			this.commission = 0.15 * super.getBasicSalary();
		else if (sales >= 15000 && sales < 50000)
			this.commission = 0.25 * super.getBasicSalary();
		else if (sales >= 50000)
			this.commission = 0.50 * super.getBasicSalary();
		else
			System.out.println("Commission is not applicable to you...");

		this.netSalary = super.getBasicSalary() + this.commission;
	 
	}

	@Override
	public String toString() {
		return  "["+"empID= " + getEmpId() + ", empName= " + getName() + ", Salary= " + getBasicSalary()+" SalesEmployee [sales=" + sales + ", commission=" + commission + ", netSalary=" + netSalary
				+ "]";
	}
	
	

}
