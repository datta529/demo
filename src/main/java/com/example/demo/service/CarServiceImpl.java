package com.example.demo.service;


 import com.example.demo.repository.CarRepository;
import com.example.demo.dao.Car;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService  {


    @Autowired
    CarRepository CarRepository;

    @Override
    public List<Car> getCar() {
        return CarRepository.findAll();
    }

    @Override
    public void addCar(Car car) {
        CarRepository.save(car);
    }

    @Override
    public void deleteCar(Long car_id){CarRepository.deleteById(car_id);}


    @Override
    public Car getCarBycar_Id(Long car_id) {
        return CarRepository.findById(car_id).orElse(null);
    }
}
