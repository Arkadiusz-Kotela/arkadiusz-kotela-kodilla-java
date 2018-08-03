package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class OrdersRepository implements CommerceRepository{

    public boolean createOrder(Customer customer, Supplier supplier, int foodNameQuantity, LocalDate orderDate) {
        System.out.println("Order created: "
                + customer.toString() + ", supplier name: "
                + supplier.getSupplierName() + ", food: "
                + supplier.getFoodName() + ", qty: "
                + foodNameQuantity + ", ordered on: "
                + orderDate.toString());
        return true;
    }
}
