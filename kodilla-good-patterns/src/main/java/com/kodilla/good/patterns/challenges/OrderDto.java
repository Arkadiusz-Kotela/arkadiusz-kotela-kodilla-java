package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderDto {
    private Customer customer;
    private Product product;
    private LocalDate orderDate;
    private boolean isOrdered;

    public OrderDto(final Customer customer,
                    final Product product,
                    final LocalDate orderDate,
                    final boolean isOrdered) {
        this.customer = customer;
        this.product = product;
        this.orderDate = orderDate;
        this.isOrdered = isOrdered;
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

    public boolean isOrdered() {
        return isOrdered;
    }
}
