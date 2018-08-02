package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderService implements CommerceService{
    public boolean order(final Customer customer, final Product product, final LocalDate orderDate) {

        System.out.println("Order: " + customer.getCustomerFirstName() + customer.getCustomerLastName() +
        " ordered: " + product.getProductName() + ", price: " + product.getProductPrice()
                + " on: " + orderDate.toString());
        return true;
    }
}
