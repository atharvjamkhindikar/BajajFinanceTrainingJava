package com.training.org.beans;

import java.util.ArrayList;
import java.util.Date;

public class Project {

	private int projectId;
	private String projectName;
	private String managerName;
	private  static ArrayList<String> listOfMembers;
	private Date startDate;

	public Project() {
		super();
	}

	public Project(int projectId, String projectName, String managerName, ArrayList<String> members, Date startDate) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.managerName = managerName;
		this.listOfMembers = members;
		this.startDate = startDate;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public ArrayList<String> getMembers() {
		return listOfMembers;
	}

	public void setMembers(ArrayList<String> members) {
		this.listOfMembers = members;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", managerName=" + managerName
				+ ", members=" + listOfMembers + ", startDate=" + startDate + "]";
	}

}
