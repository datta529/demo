package com.example.demo.repository;

import com.example.demo.dao.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
    List<Customers> findByAddress(String address);

    List<Customers> findByCity(String city);

    List<Customers> findByCarmodel(String carModel);



}
