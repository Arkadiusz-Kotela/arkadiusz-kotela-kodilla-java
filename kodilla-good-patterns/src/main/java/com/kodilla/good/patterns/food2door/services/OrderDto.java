package com.kodilla.good.patterns.food2door.services;

import com.kodilla.good.patterns.food2door.Customer;

import java.time.LocalDate;

public class OrderDto {

    private Customer customer;
    private String supplierName;
    private LocalDate orderDate;
    private boolean isOrdered;

    public OrderDto(final Customer customer,
                    final String supplierName,
                    final LocalDate orderDate,
                    final boolean isOrdered) {
        this.customer = customer;
        this.supplierName = supplierName;
        this.orderDate = orderDate;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}