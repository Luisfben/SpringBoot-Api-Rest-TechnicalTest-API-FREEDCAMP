package com.freedcamp.api.dto;

import java.sql.Timestamp;
import java.util.Date;

import com.freedcamp.api.common.Utilities;

public class RequestApiDto {

	private String projectid;
	private String apikeypublic;
	private String apikeysecret;
	private String timestamp;
	private String hash;

	public RequestApiDto(String apikeypublic, String apikeysecret) {
		this.apikeypublic = apikeypublic;
		this.apikeysecret = apikeysecret;
		PrepareDataRequest();
	}

	private void PrepareDataRequest() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());

		this.timestamp = "" + ts.getTime();

		this.hash = Utilities.hmacSha1(apikeypublic + ts.getTime(), apikeysecret);
	}

	public String getProjectid() {
		return projectid;
	}

	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}

	public String getApikeypublic() {
		return apikeypublic;
	}

	public void setApikeypublic(String apikeypublic) {
		this.apikeypublic = apikeypublic;
	}

	public String getApikeysecret() {
		return apikeysecret;
	}

	public void setApikeysecret(String apikeysecret) {
		this.apikeysecret = apikeysecret;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String toStringParametersProjects() {
		return "?api_key=" + apikeypublic + "&timestamp=" + timestamp + "&hash=" + hash;
	}

	public String toStringParametersTasks() {
		return "?project_id=" + projectid + "&api_key=" + apikeypublic + "&timestamp=" + timestamp + "&hash=" + hash;
	}

}
