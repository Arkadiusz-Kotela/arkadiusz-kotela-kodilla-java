package com.kodilla.good.patterns.food2door.suppliers;

public abstract class Supplier {

    private String supplierName;
    private String foodName;

    public Supplier() {}

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

    public abstract boolean process(int foodQuantity);
}
