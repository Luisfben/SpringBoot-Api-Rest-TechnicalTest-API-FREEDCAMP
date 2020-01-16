package com.freedcamp.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.freedcamp.api.dto.ProjectListAllDto;
import com.freedcamp.api.model.Project;

@Repository 
public interface ProjectRepository extends JpaRepository<Project, Long> {

	@Query("SELECT new com.freedcamp.api.dto.ProjectListAllDto(p.ID_PROJECT AS idProject, " + 
			"p.NAME AS name, " +
			"t.TASK_GROUP_NAME as listTask, " +
			"t.TITLE AS task, " +
			"c.NAME AS company, " +
			"m.NAME AS market, " +
			"s.NAME AS service)" +
			"FROM Project p " +
			"LEFT JOIN Task t " + 
			"ON p.ID_PROJECT = t.ID_PROJECT " +
			"LEFT JOIN Company c " +
			"ON p.ID_COMPANY = c.ID_COMPANY " +
			"LEFT JOIN Market m " +
			"ON p.ID_MARKET = m.ID_MARKET " +
			"LEFT JOIN Service s " +
			"ON p.ID_SERVICE = s.ID_SERVICE " +
			"ORDER BY p.ID_PROJECT, t.ID_TASK"
			)
		List<ProjectListAllDto> ProjectListAllDto();
}
