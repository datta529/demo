package com.example.demo.controllers;

import com.example.demo.dao.Car;
 import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/car")
public class CarController {
    @Autowired
    CarService CarService;



    @GetMapping("/car_id/{car_id}")
    public Car getCarBycar_Id(@PathVariable("car_id") Long car_id) {
        return CarService.getCarBycar_Id(car_id);
    }

    @GetMapping("/get-cars")
    public List<Car> getcar() {
        return CarService.getCar();
    }

    @PostMapping("/addcar")
    public void addCar(@RequestBody Car car) {CarService.addCar(car);
    }

    @DeleteMapping("/dcar")
    public void deleteCar(@RequestParam Long car_id){
        CarService.deleteCar(car_id);
    }



}