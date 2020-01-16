package com.freedcamp.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT")
public class Project {
	@Id
	private Long ID_PROJECT;

	@Column
	private String NAME;

	@Column
	private String DESCRIPTION;

	@Column
	private Long ID_COMPANY;

	@Column
	private Long ID_MARKET;

	@Column
	private Long ID_SERVICE;

	public Long getID_PROJECT() {
		return ID_PROJECT;
	}

	public void setID_PROJECT(Long iD_PROJECT) {
		ID_PROJECT = iD_PROJECT;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public Long getID_COMPANY() {
		return ID_COMPANY;
	}

	public void setID_COMPANY(Long iD_COMPANY) {
		ID_COMPANY = iD_COMPANY;
	}

	public Long getID_MARKET() {
		return ID_MARKET;
	}

	public void setID_MARKET(Long iD_MARKET) {
		ID_MARKET = iD_MARKET;
	}

	public Long getID_SERVICE() {
		return ID_SERVICE;
	}

	public void setID_SERVICE(Long iD_SERVICE) {
		ID_SERVICE = iD_SERVICE;
	}

}
