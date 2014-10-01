package org.softwarepathfinder.dashboard.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.softwarepathfinder.dashboard.model.Project;

@ManagedBean
@RequestScoped
public class ProjectBean {

	private Project project;

	public ProjectBean() {
		this.project = new Project();
		this.project.setName("Software Pathfinder");
	}

	public String add() {
		System.out.println("Add");
		return "form";
	}

	public String edit() {
		System.out.println("Edit");
		return "form";
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
