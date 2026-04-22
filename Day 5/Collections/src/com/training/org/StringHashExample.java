package com.training.org;

import com.training.org.beans.Student;

public class StringHashExample {

	public static void main(String[] args) {

       String s1="Atharv"; 
       System.out.println(s1.hashCode());
       
       Student s2 = new Student(22, "Atharv");
       System.out.println(s2.hashCode());
       
        Integer i1 = 200;
       System.out.println(i1);
       
       Character ch='A';
	   System.out.println(ch.hashCode());

	}

}
