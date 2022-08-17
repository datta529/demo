package com.example.demo.controllers;


import com.example.demo.dao.Purchase;
import com.example.demo.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/Purchase")
public class PurchaseController {

    @Autowired
    PurchaseService PurchaseService;


    @GetMapping("/get-Purchase")
    public List<Purchase> getPurchase() {
        return PurchaseService.getPurchase();
    }
}
