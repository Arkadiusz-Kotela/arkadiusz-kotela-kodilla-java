package com.kodilla.good.patterns.food2door.suppliers;

public class ExtraFoodShop extends Supplier {

    private int foodNameQuantity = 10;

    public ExtraFoodShop() {
        super();
    }

    public ExtraFoodShop(String supplierName, String foodName) {
        super(supplierName, foodName);
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
