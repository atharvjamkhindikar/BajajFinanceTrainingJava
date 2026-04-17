package com.org.training;

import java.util.ArrayList;

public class ComplexMain {

	public static void main(String[] args) {
		Complex c1 = new Complex();

		//c1.showValues();
		
		Complex c2=new Complex(5,6);
		//c2.showValues();
		
		ArrayList<Complex> complexList = new ArrayList<>();
		
		complexList.add(c1);
		complexList.add(c2);
		complexList.add((new Complex(50,60)));
		
		
		for(Complex comp:complexList)
		{
			comp.showValues();
			complexList.add((new Complex(80,60)));  // not allowed 
		}

	}

}
