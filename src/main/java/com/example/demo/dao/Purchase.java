package com.example.demo.dao;


 import javax.persistence.*;

@Entity
@Table(name="purchase")
public class Purchase {

    @Id
    private Long purchaseId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vinNumber")
    private Inventory inventory;




    private Long personId;


//    private String vinNumber;

    private String purchaseDate;

    private Long purchasePrice;

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        purchaseId = purchaseId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

//    public String getVinNumber() {
//        return vinNumber;
//    }
//
//    public void setVinNumber(String vinNumber) {
//        this.vinNumber = vinNumber;
//    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String toString() {
        return  "purchaseId = " + this.purchaseId + "\n" +
                "personId = " + this.personId + "\n" +
                "purchaseDate = " + this.purchaseDate + "\n" +
                "purchasePrice = " + this.purchasePrice
                + "\n" +
                "inventory = " + this.inventory;
    }
}