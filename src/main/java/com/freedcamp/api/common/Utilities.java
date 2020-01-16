package com.freedcamp.api.common;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

import com.freedcamp.api.dto.ProjectsDto;
import com.freedcamp.api.dto.TasksDto;
import com.freedcamp.api.model.Project;
import com.freedcamp.api.model.Task;

public class Utilities {
	public static String hmacSha1(String value, String key) {
		try {
			// Get an hmac_sha1 key from the raw key bytes
			byte[] keyBytes = key.getBytes();
			SecretKeySpec signingKey = new SecretKeySpec(keyBytes, "HmacSHA1");

			// Get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance("HmacSHA1");
			mac.init(signingKey);

			// Compute the hmac on input data bytes
			byte[] rawHmac = mac.doFinal(value.getBytes());

			// Convert raw bytes to Hex
			byte[] hexBytes = new Hex().encode(rawHmac);

			// Covert array of Hex bytes to a String
			return new String(hexBytes, "UTF-8");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static Project transform(ProjectsDto projectsdto) {
		Project project = new Project();

		project.setID_PROJECT(new Long(projectsdto.getProject_id()));
		project.setNAME(projectsdto.getProject_name());
		project.setDESCRIPTION(projectsdto.getProject_description());
		project.setID_COMPANY(new Long(projectsdto.getCompany()));
		project.setID_MARKET(new Long(projectsdto.getMarket()));
		project.setID_SERVICE(new Long(projectsdto.getService()));

		return project;
	}

	public static Task transform(TasksDto tasksDto) {
		Task task = new Task();

		task.setID_TASK(new Long(tasksDto.getId()));
		task.setID_PROJECT(new Long(tasksDto.getProject_id()));
		task.setTITLE(tasksDto.getTitle());
		task.setTASK_GROUP_NAME(tasksDto.getTask_group_name());

		return task;
	}

}
