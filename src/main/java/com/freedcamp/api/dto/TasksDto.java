package com.freedcamp.api.dto;

public class TasksDto {
	private String id;
	private String title;
	private String task_group_name;
	private String project_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTask_group_name() {
		return task_group_name;
	}

	public void setTask_group_name(String task_group_name) {
		this.task_group_name = task_group_name;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

}
