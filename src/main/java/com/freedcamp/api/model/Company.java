package com.freedcamp.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class Company {
	@Id
	private Long ID_COMPANY;

	@Column
	private String NAME;

	public Long getID_COMPANY() {
		return ID_COMPANY;
	}

	public void setID_COMPANY(Long iD_COMPANY) {
		ID_COMPANY = iD_COMPANY;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

}
