package com.freedcamp.api.dto;

public class ProjectsDto {
	private String project_id;
	private String project_name;
	private String project_description;
	private String company;
	private String market;
	private String service;
	private TasksDto[] taskDto;

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_description() {
		return project_description;
	}

	public void setProject_description(String project_description) {
		this.project_description = project_description;

		String[] parse = project_description.split(",");

		this.company = parse[0];
		this.market = parse[1];
		this.service = parse[2];
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public TasksDto[] getTaskDto() {
		return taskDto;
	}

	public void setTaskDto(TasksDto[] taskDto) {
		this.taskDto = taskDto;
	}

}
