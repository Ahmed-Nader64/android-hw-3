package com.example.myapplication;

public class Items {
    public Items(String itemName, int itemPrice, int itemImge) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImge = itemImge;
    }

    private String itemName;
    private int itemPrice;
    private int itemImge;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemImge() {
        return itemImge;
    }

    public void setItemImge(int itemImge) {
        this.itemImge = itemImge;
    }
}

