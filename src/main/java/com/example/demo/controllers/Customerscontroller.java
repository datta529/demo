package com.example.demo.controllers;

import com.example.demo.dao.Customers;
import com.example.demo.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class Customerscontroller {

    @Autowired
    CustomersService customersService;

    @GetMapping("/get-customers")
    public List<Customers> getCustomers() {

        return customersService.getCustomers();
    }

    @GetMapping("/id/{id}")
    public Customers getCustomersByID(@PathVariable("id") Long id) {
        return customersService.getCustomersById(id);
    }


    @GetMapping("/address")
    public List<Customers> getCustomersByAddress(@RequestParam("address") String address) {
        return customersService.getCustomersByAddress(address);

    }

    @GetMapping("/city/{city}")
    public List<Customers> getCustomersByCity(@PathVariable("city") String city) {
        return customersService.getCustomersByCity(city);
    }


    @PostMapping("/addCustomers")
    public void addCustomers(@RequestBody Customers customers) {
        customersService.addCustomers(customers);
    }



    @PutMapping("updateCityById/{id}/{city}")
    public void updateName(@PathVariable("id") Long id, @PathVariable("city") String city)
    {
        customersService.updateCityById(id,city);

    }



}



