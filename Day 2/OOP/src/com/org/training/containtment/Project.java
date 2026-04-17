package com.org.training.containtment;

import java.util.ArrayList;

import com.org.training.employee.Employee;

public class Project {

	private String projectName;
	private String clientName;
	private ArrayList<String> techStack;
	private ArrayList<Employee> projectMembers;
	
	public Project() {
		this.projectName="";
		this.clientName="";
		this.techStack=new ArrayList<>();
		this.projectMembers=new ArrayList<>();
		
	}

	
	public Project(String projectname, String clientName, ArrayList<String> techStack,
			ArrayList<Employee> projectMembers) {
		
		this.projectName = projectname;
		this.clientName = clientName;
		this.techStack = techStack;
		this.projectMembers =projectMembers;
	}


	public String getProjectname() {
		return projectName;
	}


	public void setProjectname(String projectname) {
		this.projectName = projectname;
	}


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public ArrayList<String> getTechStack() {
		return techStack;
	}


	public void setTechStack(ArrayList<String> techStack) {
		this.techStack = techStack;
	}


	public ArrayList<Employee> getProjectMembers() {
		return projectMembers;
	}


	public void setProjectMembers(ArrayList<Employee> projectMembers) {
		this.projectMembers = projectMembers;
	}


	@Override
	public String toString() {
		return "Project [projectname=" + projectName + ", clientName=" + clientName + ", techStack=" + techStack
				+ ", projectMembers=" + projectMembers + "]";
	}

	
	
	
	
	
	
	
	
}
