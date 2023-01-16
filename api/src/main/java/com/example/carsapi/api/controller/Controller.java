package com.example.carsapi.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carsapi.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class Controller {

    @PostMapping
    public void createCar(@RequestBody CarDTO req){
        System.out.println(req.modelo());
        System.out.println(req.fabricante());
        System.out.println(req.valor());
        System.out.println(req.anoModelo());
    }
}
