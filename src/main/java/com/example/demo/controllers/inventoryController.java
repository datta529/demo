package com.example.demo.controllers;



import com.example.demo.dao.Inventory;
import com.example.demo.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/inventory")
public class inventoryController {

    @Autowired
    InventoryService InventoryService;

    @GetMapping("/get-inventory")
    public List<Inventory> getInventory() {

        return InventoryService.getInventory();
    }
}
