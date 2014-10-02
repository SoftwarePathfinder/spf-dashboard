package org.softwarepathfinder.dashboard.repository;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;

import org.softwarepathfinder.dashboard.model.Project;

@ApplicationScoped
public class ProjectRepostitory {

	// TODO change it to DI. just used to emulate a persistent sample
	private static final ProjectRepostitory INSTANCE = new ProjectRepostitory();

	private List<Project> projectsList = createProjectsList();

	public static ProjectRepostitory get() {
		return INSTANCE;
	}

	private List<Project> createProjectsList() {
		List<Project> projectsList = new ArrayList<Project>();
		projectsList.add(new Project("Software Pathfinder", 100));
		projectsList.add(new Project("JBoss AS", 50));
		projectsList.add(new Project("Hibernate ORM", 30));
		projectsList.add(new Project("Apache Tomcat", 5));
		projectsList.add(new Project("Google Guava", 20));
		projectsList.add(new Project("Apache Hadoop", 0));
		return projectsList;
	}

	public List<Project> getProjectList() {
		return projectsList;
	}

	public void save(Project project) {
		if (!projectsList.contains(project))
			projectsList.add(project);
	}

}
