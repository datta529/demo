package com.example.demo.service;


import com.example.demo.dao.Customers;

import java.util.List;

    public interface CustomersService {

        static void save(Customers customersObj) {
        }



        List<Customers> getCustomers();
        List<Customers> getCustomersByAddress(String address);
        List<Customers> getCustomersByCity(String  city);


        void addCustomers(Customers customers);

        Customers getCustomersById(Long id);


        void updateCityById(Long id, String city);
    }


