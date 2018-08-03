package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class OrderService implements CommerceService {

    @Override
    public boolean order(Customer customer, Supplier supplier, int foodNameQuantity, LocalDate orderDate) {
        System.out.println("Order: " + customer.getCustomerFirstName() + customer.getCustomerLastName() +
                " ordered from: " + supplier.getSupplierName() + ", food: " + supplier.getFoodName() +
                ", quantity: " + foodNameQuantity +
                " on: " + orderDate.toString());

        return true;
    }
}
