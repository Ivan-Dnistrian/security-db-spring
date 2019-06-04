package com.example.securitydbspring.controller;

import com.example.securitydbspring.cars.Cars;
import com.example.securitydbspring.dao.CarsDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class Controller {

    public CarsDAO carsDAO;
    
    @GetMapping("/")
    public String home(){
        return "you are at home";
    }

    @PostMapping("/save")
    public Cars save (Cars cars){
        carsDAO.save(cars);
        return cars;
    }
    @GetMapping("/cars{id}")
    public Cars getUser(@PathVariable int id){
        Cars carId = carsDAO.findById(id).get();
        return carId;
    }
    @GetMapping("/allcars")
    public Cars getAll(){
        Cars carAll = (Cars) carsDAO.findAll();
        return carAll;
    }
    @PostMapping("/delete{id}")
    public Cars deleteId(@PathVariable int id) {
        Cars deleteId = carsDAO.findById(id).get();
        carsDAO.delete(deleteId);
        return deleteId;
    }
}
