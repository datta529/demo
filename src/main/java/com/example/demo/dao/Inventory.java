package com.example.demo.dao;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="inventory")
public class Inventory {

    @Id
    private String vinNumber;


//    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Purchase> purchases = new ArrayList<>();


    private Long carId;

    private String colorExterior;

    private String colorInterior;

    private String transmissionType;

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getColorExterior() {
        return colorExterior;
    }

    public void setColorExterior(String colorExterior) {
        this.colorExterior = colorExterior;
    }

    public String getColorInterior() {
        return colorInterior;
    }

    public void setColorInterior(String colorInterior) {
        this.colorInterior = colorInterior;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
    public String toString() {
        return "vinNumber = " + this.vinNumber + "\n" +
                "colorExterior = " + this.colorExterior + "\n" +
                "colorInterior = " + this.colorInterior + "\n" +
                "transmissionType = " + this.transmissionType ;
    }

//    public List<Purchase> getPurchases() {
//        return purchases;
//    }
//
//    public void setPurchases(List<Purchase> purchases) {
//        this.purchases = purchases;
//    }
}


















