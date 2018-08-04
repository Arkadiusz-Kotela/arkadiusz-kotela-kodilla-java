package com.kodilla.good.patterns.food2door.services;

import com.kodilla.good.patterns.food2door.CommerceService;
import com.kodilla.good.patterns.food2door.Customer;
import com.kodilla.good.patterns.food2door.suppliers.Supplier;

import java.time.LocalDate;

public class OrderService implements CommerceService {

    @Override
    public boolean order(Customer customer, Supplier supplier, int foodNameQuantity, LocalDate orderDate) {
        if (supplier.process(foodNameQuantity)) {
            System.out.println("Order: " + customer.getCustomerFirstName() + customer.getCustomerLastName() +
                    " ordered from: " + supplier.getSupplierName() + ", food: " + supplier.getFoodName() +
                    ", quantity: " + foodNameQuantity +
                    " on: " + orderDate.toString());
            return true;
        } else {
            System.out.println(customer.getCustomerEmail() + " Error. Ordered food quantity not available");
            return false;
        }
    }
}
