package com.globalmatics.bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globalmatics.bike.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
