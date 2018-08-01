package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

class OrderRequest {
    private Customer customer;
    private Product product;
    private LocalDate orderDate;

    OrderRequest(Customer customer, Product product, LocalDate orderDate) {
        this.customer = customer;
        this.product = product;
        this.orderDate = orderDate;
    }

    Customer getCustomer() {
        return customer;
    }

    Product getProduct() {
        return product;
    }

    LocalDate getOrderDate() {
        return orderDate;
    }
}
