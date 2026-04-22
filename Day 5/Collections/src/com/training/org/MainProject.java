package com.training.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.training.org.beans.Project;

public class MainProject {

	public static void main(String[] args) {
		
		ArrayList<Project> listOfProjects = new ArrayList<>();
		
		ArrayList<String> members = new ArrayList<>();
		members.add("Atharv");
		members.add("Akshay");
		members.add("Aditya");
		members.add("Aniket");
		
		listOfProjects.add(new Project(101, "Project A", "John Doe", members, new Date()));
        
		Iterator it = listOfProjects.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
