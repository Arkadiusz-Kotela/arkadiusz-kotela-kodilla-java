package com.kodilla.good.patterns.food2door.suppliers;

public class HealthFood extends Supplier {

    private int foodNameQuantity = 20;

    public HealthFood() {
        super();
    }

    public HealthFood(String supplierName, String foodName) {
        super(supplierName, foodName);
    }

    public void setFoodNameQuantity(int foodNameQuantity) {
        this.foodNameQuantity = foodNameQuantity;
    }

    @Override
    public boolean process(int foodQuantity) {
        if (foodQuantity > foodNameQuantity) {
            return false;
        }else {
            System.out.println("Order is being prepared .....");
            return true;
        }
    }
}
