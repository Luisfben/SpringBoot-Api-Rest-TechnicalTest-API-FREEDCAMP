package com.freedcamp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freedcamp.api.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
