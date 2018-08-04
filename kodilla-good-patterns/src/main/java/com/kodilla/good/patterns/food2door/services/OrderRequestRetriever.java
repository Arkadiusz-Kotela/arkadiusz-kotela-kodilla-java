package com.kodilla.good.patterns.food2door.services;

import com.kodilla.good.patterns.food2door.Customer;
import com.kodilla.good.patterns.food2door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.suppliers.HealthFood;
import com.kodilla.good.patterns.food2door.suppliers.Supplier;

import java.time.LocalDate;

public class OrderRequestRetriever {

    private Customer customer;
    private Supplier supplier;
    private int orderQty;
    LocalDate orderDate;

    public OrderRequestRetriever(Customer customer, Supplier supplier, int orderQty, LocalDate orderDate) {
        this.customer = customer;
        this.supplier = supplier;
        this.orderQty = orderQty;
        this.orderDate = orderDate;
    }

    public OrderRequest retrieve() {

        return new OrderRequest(
                customer,
                supplier,
                orderQty,
                orderDate);
    }
}
