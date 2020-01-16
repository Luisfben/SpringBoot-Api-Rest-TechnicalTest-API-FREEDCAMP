package com.freedcamp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freedcamp.api.model.Market;

public interface MarketRepository extends JpaRepository<Market, Long> {

}
