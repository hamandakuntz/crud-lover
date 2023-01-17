package com.example.carsapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carsapi.api.model.Cars;

public interface CarsRepository extends JpaRepository<Cars, Long>{
    
}
