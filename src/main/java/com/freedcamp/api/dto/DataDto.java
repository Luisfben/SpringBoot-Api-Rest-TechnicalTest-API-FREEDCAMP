package com.freedcamp.api.dto;

public class DataDto {
	private ProjectsDto[] Projects;
	private TasksDto[] Tasks;

	public ProjectsDto[] getProjects() {
		return Projects;
	}

	public void setProjects(ProjectsDto[] projects) {
		Projects = projects;
	}

	public TasksDto[] getTasks() {
		return Tasks;
	}

	public void setTasks(TasksDto[] tasks) {
		Tasks = tasks;
	}

}
