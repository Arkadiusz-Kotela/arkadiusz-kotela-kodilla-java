package com.kodilla.good.patterns.food2door.services;

import com.kodilla.good.patterns.food2door.Customer;
import com.kodilla.good.patterns.food2door.suppliers.Supplier;

import java.time.LocalDate;

public class OrderRequest {
    private Customer customer;
    private Supplier supplier;
    private int foodNameQuantity;
    private LocalDate orderDate;

    public OrderRequest(Customer customer, Supplier supplier, int foodNameQuantity, LocalDate orderDate) {
        this.customer = customer;
        this.supplier = supplier;
        this.foodNameQuantity = foodNameQuantity;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getFoodNameQuantity() {
        return foodNameQuantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
