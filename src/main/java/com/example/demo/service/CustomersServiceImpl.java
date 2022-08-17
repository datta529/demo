package com.example.demo.service;

import com.example.demo.dao.Customers;
import com.example.demo.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomersServiceImpl implements CustomersService {

    @Autowired
    CustomersRepository customersRepository;


    @Override
    public List<Customers> getCustomers() {return customersRepository.findAll();}

    public Customers getCustomersById(Long id) {
        return customersRepository.findById(id).orElse(null);
    }

    @Override
    public void updateCityById(Long id, String city) {
        Customers customer = customersRepository.findById(id).orElse(null);
        customer.setCity(city);
        customersRepository.save(customer);
    }


    public List<Customers> getCustomersByCarModel(String carModel) {
        return customersRepository.findByCarmodel(carModel);
    }

    @Override
    public List<Customers> getCustomersByAddress(String address) {

        return customersRepository.findByAddress(address);
    }

   @Override
    public List<Customers> getCustomersByCity(String city) {

       return customersRepository.findByCity(city);
    }

    @Override
    public void addCustomers(Customers customers) {
        customersRepository.save(customers);

    }
}
