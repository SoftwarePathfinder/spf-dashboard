package org.softwarepathfinder.dashboard.repository;

import java.util.ArrayList;
import java.util.List;

import org.softwarepathfinder.dashboard.model.Project;

public class ProjectRepostitory {

	public List<Project> getProjectList() {
		List<Project> projectsList = new ArrayList<Project>();
		projectsList.add(new Project("Software Pathfinder", 100));
		projectsList.add(new Project("JBoss AS", 50));
		projectsList.add(new Project("Hibernate ORM", 30));
		projectsList.add(new Project("Apache Tomcat", 5));
		projectsList.add(new Project("Google Guava", 20));
		projectsList.add(new Project("Apache Hadoop", 0));
		return projectsList;
	}
}
