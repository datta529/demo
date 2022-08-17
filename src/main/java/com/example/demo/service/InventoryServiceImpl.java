package com.example.demo.service;



import com.example.demo.dao.Inventory;
import com.example.demo.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryRepository InventoryRepository;


    @Override
    public List<Inventory> getInventory() {return InventoryRepository.findAll();}

}
