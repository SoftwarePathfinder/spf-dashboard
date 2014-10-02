package org.softwarepathfinder.dashboard.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.softwarepathfinder.dashboard.model.Project;
import org.softwarepathfinder.dashboard.repository.ProjectRepostitory;

@ManagedBean
@RequestScoped
public class ProjectBean {

	private Project project;
	private ProjectRepostitory repository;

	public ProjectBean() {
		//TODO: use DI instead of tihs
		repository = new ProjectRepostitory();
	}

	public String add() {
		System.out.println("Add");
		return "project/form";
	}

	public String edit() {
		System.out.println("Edit");
		return "project/form";
	}

	public List<Project> getProjectList() {
		return repository.getProjectList();
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
