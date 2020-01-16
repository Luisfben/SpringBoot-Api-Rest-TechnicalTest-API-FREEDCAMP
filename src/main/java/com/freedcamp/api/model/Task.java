package com.freedcamp.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TASK")
public class Task {
	@Id
	private Long ID_TASK;

	@Column
	private Long ID_PROJECT;

	@Column
	private String TITLE;

	@Column
	private String TASK_GROUP_NAME;

	public Long getID_TASK() {
		return ID_TASK;
	}

	public void setID_TASK(Long iD_TASK) {
		ID_TASK = iD_TASK;
	}

	public Long getID_PROJECT() {
		return ID_PROJECT;
	}

	public void setID_PROJECT(Long iD_PROJECT) {
		ID_PROJECT = iD_PROJECT;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getTASK_GROUP_NAME() {
		return TASK_GROUP_NAME;
	}

	public void setTASK_GROUP_NAME(String tASK_GROUP_NAME) {
		TASK_GROUP_NAME = tASK_GROUP_NAME;
	}

}
