package com.freedcamp.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICE")
public class Service {
	@Id
	private Long ID_SERVICE;

	@Column
	private String NAME;

	public Long getID_SERVICE() {
		return ID_SERVICE;
	}

	public void setID_SERVICE(Long iD_SERVICE) {
		ID_SERVICE = iD_SERVICE;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

}
