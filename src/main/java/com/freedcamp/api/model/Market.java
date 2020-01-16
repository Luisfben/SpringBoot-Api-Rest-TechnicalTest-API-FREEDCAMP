package com.freedcamp.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MARKET")
public class Market {
	@Id
	private Long ID_MARKET;

	@Column
	private String NAME;

	public Long getID_MARKET() {
		return ID_MARKET;
	}

	public void setID_MARKET(Long iD_MARKET) {
		ID_MARKET = iD_MARKET;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

}
