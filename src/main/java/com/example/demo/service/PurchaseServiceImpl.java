package com.example.demo.service;



import com.example.demo.dao.Purchase;
import com.example.demo.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    PurchaseRepository PurchaseRepository;

    @Override
    public List<Purchase> getPurchase() {
        List<Purchase> purchases = PurchaseRepository.findAll();

        if(!CollectionUtils.isEmpty(purchases)) {
            purchases.forEach(purchase -> {
                System.out.println("Purchases: " + purchase);
            });
        }

        return purchases;
    }
}
