package com.kodilla.good.patterns.food2door.services;

import com.kodilla.good.patterns.food2door.CommerceRepository;
import com.kodilla.good.patterns.food2door.Customer;
import com.kodilla.good.patterns.food2door.suppliers.Supplier;

import java.time.LocalDate;

public class OrdersRepository implements CommerceRepository {

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
