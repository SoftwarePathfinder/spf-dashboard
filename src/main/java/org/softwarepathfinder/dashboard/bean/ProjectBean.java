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
		//TODO: use DI instead of this
		repository = ProjectRepostitory.get();
		project = new Project();
	}

	public String add() {
		return form();
	}

	public String edit(Project project) {
		this.project = project;
		return form();
	}

	public String save() {
		repository.save(project);
		return list();
	}

	private String form() {
		return "/project/form";
	}

	private String list() {
		return "/project/list";
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
