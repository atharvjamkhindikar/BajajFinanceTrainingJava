package com.org.training.employee;

public class ZOrganization {

	public static void main(String[] args) {
		
//		SalesEmployee se1=new SalesEmployee(6500,101,"Humza",18225);
//		System.out.println(se1);
//		se1.calculateSalary();
//		System.out.println(se1);

		WageEmployee we1=new WageEmployee(1,"Jameel Jamali",10000,"March",8,1000);
		
		System.out.println(we1);
		
		we1.calculateSalary();
		System.out.println(we1);
	}

}
