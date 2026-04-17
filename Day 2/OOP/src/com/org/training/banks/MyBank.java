package com.org.training.banks;

import java.util.ArrayList;

public class MyBank {

	public static void main(String[] args) {

		Address a1 = new Address("Pune", "Maharashtra", 411016);
		Address a2 = new Address("Pune", "Maharashtra", 411014);
		Address a3 = new Address("Mumbai", "Maharashtra", 416406);
		Address a4 = new Address("Kolhapur", "Maharashtra", 416106);

		Customer c1 = new Customer(2, "Akshay", a2, "4578961203", 50000);
		Customer c2 = new Customer(3, "Harsh", a4, "4578561203", 43000);
		Customer c3 = new Customer(4, "Tony", a1, "9472365150", 500000);
		Customer c4 = new Customer(5, "Cris", a1, "6897452002", 70000);
		Customer c5 = new Customer(6, "Natasha", a3, "126574980", 50000);

		ArrayList<Customer> clist = new ArrayList<>();
		clist.add(new Customer(1, "Atharv", a1, "4569871254", 450000));
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		clist.add(c4);
		clist.add(c5);
		
		

	}

}
