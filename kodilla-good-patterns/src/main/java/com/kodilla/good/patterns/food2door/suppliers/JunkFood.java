package com.kodilla.good.patterns.food2door.suppliers;

public class JunkFood extends Supplier {

    private int foodNameQuantity = 1;

    public JunkFood() {
        super();
    }

    public JunkFood(String supplierName, String foodName) {
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
