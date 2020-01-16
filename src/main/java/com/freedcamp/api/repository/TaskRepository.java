package com.freedcamp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freedcamp.api.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
