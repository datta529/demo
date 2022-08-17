package com.example.demo.service;



import com.example.demo.dao.Car;

import java.util.List;
public interface CarService {

    List<Car> getCar();

    void addCar(Car car);

    void deleteCar(Long car_id);

    Car getCarBycar_Id(Long car_id);
}
