package com.training.org;

import java.util.Scanner;

public class DaysofMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a Month ");
	    String Month=sc.next();
	    
	    switch(Month)
	    {
	    case "January","March","May","July","August","October","December"->{
	    	System.out.println("Number of Days = "+31);
	    }
	    case "April","June","September","November"->{
	    	System.out.println("Number of Days ="+30);
	    }
	    case "February"->{
	    	System.out.println("Number of Days ="+28+"/"+29);
	    }
	    default ->{
	    	System.out.println("Enter Valid Month");
	    }
	    }
	    
		
	}
}
