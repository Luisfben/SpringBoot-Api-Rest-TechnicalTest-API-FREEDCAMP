package com.freedcamp.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.freedcamp.api.common.Utilities;
import com.freedcamp.api.dto.ProjectsDto;
import com.freedcamp.api.dto.RequestApiDto;
import com.freedcamp.api.dto.ResponseProjectsDto;
import com.freedcamp.api.repository.ProjectRepository;
import com.freedcamp.api.repository.TaskRepository;

@Service
public class RequestApiServiceImpl implements RequestApiService {

	@Value("${api.url.freedcamp.projects}")
	private String urlApiProjects;

	@Value("${api.url.freedcamp.tasks}")
	private String urlApiTasks;

	@Autowired
	private ProjectRepository projectRepository;

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void upload(RequestApiDto requestApiDto) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseProjectsDto responseProjectDto = restTemplate
				.getForObject(urlApiProjects + requestApiDto.toStringParametersProjects(), ResponseProjectsDto.class);

		ProjectsDto projectsDto[] = responseProjectDto.getData().getProjects();

		for (int i = 0; i < projectsDto.length; i++) {
			requestApiDto.setProjectid(projectsDto[i].getProject_id());
			ResponseProjectsDto responseTaskDto = restTemplate
					.getForObject(urlApiTasks + requestApiDto.toStringParametersTasks(), ResponseProjectsDto.class);
			projectsDto[i].setTaskDto(responseTaskDto.getData().getTasks());

			projectRepository.save(Utilities.transform(projectsDto[i]));

			for (int j = 0; j < projectsDto[i].getTaskDto().length; j++) {
				taskRepository.save(Utilities.transform(projectsDto[i].getTaskDto()[j]));
			}
		}
	}
}
