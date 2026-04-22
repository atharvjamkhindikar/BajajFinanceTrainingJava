package com.training.org.enumerator;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerators {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.add("Atharv");
		v.add("Akshay");
		v.add("Tony");
		v.add("Bruce");

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
