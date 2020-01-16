package com.freedcamp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freedcamp.api.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
