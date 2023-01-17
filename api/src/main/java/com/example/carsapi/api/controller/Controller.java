package com.example.carsapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carsapi.api.model.Cars;
import com.example.carsapi.api.repository.CarsRepository;
import com.example.carsapi.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class Controller {
    
    @Autowired
    private CarsRepository repository;

    @GetMapping
    public List<Cars> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public void createCar(@RequestBody CarDTO req){
        repository.save(new Cars(req));
    }
}
