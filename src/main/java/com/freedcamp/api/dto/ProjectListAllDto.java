package com.freedcamp.api.dto;

public class ProjectListAllDto {
	private Long idProject;
	private String name;
	private String listTask;
	private String task;
	private String company;
	private String market;
	private String service;

	public ProjectListAllDto(Long idProject, String name, String listTask, String task, String company, String market,
			String service) {
		super();
		this.idProject = idProject;
		this.name = name;
		this.listTask = listTask;
		this.task = task;
		this.company = company;
		this.market = market;
		this.service = service;
	}

	public Long getIdProject() {
		return idProject;
	}

	public void setIdProject(Long idProject) {
		this.idProject = idProject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getListTask() {
		return listTask;
	}

	public void setListTask(String listTask) {
		this.listTask = listTask;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
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

}
