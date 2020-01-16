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
import com.freedcamp.api.model.Company;
import com.freedcamp.api.model.Market;
import com.freedcamp.api.model.Service;
import com.freedcamp.api.repository.CompanyRepository;
import com.freedcamp.api.repository.ProjectRepository;
import com.freedcamp.api.repository.ServiceRepository;
import com.freedcamp.api.repository.MarketRepository;
import com.freedcamp.api.service.RequestApiService;

@Controller
public class ApiController {

	@Autowired
	private RequestApiService requestApiService;

	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private CompanyRepository companyRepository;

	@Autowired
	private MarketRepository marketRepository;

	@Autowired
	private ServiceRepository serviceRepository;

	private Boolean fillData = true;

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
		if (fillData) {
			fillData();
			fillData = false;
		}
		List<ProjectListAllDto> projectListAllDto = projectRepository.ProjectListAllDto();
		model.addAttribute("projects", projectListAllDto);

		return "index";
	}

	private void fillData() {
		Company company = new Company();
		company.setID_COMPANY(new Long(1));
		company.setNAME("Empresa1");
		companyRepository.save(company);
		company.setID_COMPANY(new Long(2));
		company.setNAME("Empresa2");		
		companyRepository.save(company);
		
		Market market = new Market();
		market.setID_MARKET(new Long(1));
		market.setNAME("BMW");
		marketRepository.save(market);
		market.setID_MARKET(new Long(2));
		market.setNAME("KIA");
		marketRepository.save(market);
		market.setID_MARKET(new Long(3));
		market.setNAME("MINI");
		marketRepository.save(market);
		market.setID_MARKET(new Long(4));
		market.setNAME("VOLVO");
		marketRepository.save(market);

		Service service =  new Service();
		service.setID_SERVICE(new Long(1));
		service.setNAME("Administrativas");
		serviceRepository.save(service);
		service.setID_SERVICE(new Long(2));
		service.setNAME("Soporte tecnico");
		serviceRepository.save(service);
		service.setID_SERVICE(new Long(3));
		service.setNAME("Diseño visual");
		serviceRepository.save(service);
		service.setID_SERVICE(new Long(4));
		service.setNAME("Desarrollo de software");
		serviceRepository.save(service);
		service.setID_SERVICE(new Long(5));
		service.setNAME("Consultoria");
		serviceRepository.save(service);
		
	}

}
