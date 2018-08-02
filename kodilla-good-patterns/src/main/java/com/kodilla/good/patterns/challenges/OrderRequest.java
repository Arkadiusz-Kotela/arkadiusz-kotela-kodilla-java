package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private LocalDate orderDate;

    public OrderRequest(final Customer customer,
                        final Product product,
                        final LocalDate orderDate) {
        this.customer = customer;
        this.product = product;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
