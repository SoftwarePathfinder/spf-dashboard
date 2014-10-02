package org.softwarepathfinder.dashboard.model;

public class Project {

	private String name;
	private String description;
	private int executionStatus;

	public Project() {}

	public Project(String name, int executionStatus) {
		this.name = name;
		this.executionStatus = executionStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getExecutionStatus() {
		return executionStatus;
	}

	public void setExecutionStatus(int executionStatus) {
		this.executionStatus = executionStatus;
	}
}
