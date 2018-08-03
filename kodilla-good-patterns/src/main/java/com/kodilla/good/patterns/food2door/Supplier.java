package com.kodilla.good.patterns.food2door;

public abstract class Supplier {

    private String supplierName;
    private String foodName;

    public Supplier(String supplierName, String foodName) {
        this.supplierName = supplierName;
        this.foodName = foodName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getFoodName() {
        return foodName;
    }


    public abstract void process();
}
