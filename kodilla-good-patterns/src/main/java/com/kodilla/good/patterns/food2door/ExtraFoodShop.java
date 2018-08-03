package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop extends Supplier {

    public ExtraFoodShop(String supplierName, String foodName) {
        super(supplierName, foodName);
    }

    @Override
    public void process() {
        System.out.println("Order is being processed....");
    }
}
