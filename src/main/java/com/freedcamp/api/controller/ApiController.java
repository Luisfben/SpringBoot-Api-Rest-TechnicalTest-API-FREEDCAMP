package com.freedcamp.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.freedcamp.api.dto.ProjectListAllDto;
import com.freedcamp.api.dto.RequestApiDto;
import com.freedcamp.api.repository.ProjectRepository;
import com.freedcamp.api.service.RequestApiService;

@Controller
public class ApiController {

	@Autowired
	private RequestApiService requestApiService;

	@Autowired
	private ProjectRepository projectRepository;

	@GetMapping("/upload")
	public String upload(@RequestParam String apikeypublic, @RequestParam String apikeysecret) {

		if (apikeypublic != "" && apikeysecret != "") {
			RequestApiDto requestApiDto = new RequestApiDto(apikeypublic, apikeysecret);
			requestApiService.upload(requestApiDto);
		}

		return "redirect:/";
	}

	@RequestMapping("/")
	public String index(Model model) {
		List<ProjectListAllDto> projectListAllDto = projectRepository.ProjectListAllDto();
		model.addAttribute("projects", projectListAllDto);

		return "index";
	}

}
