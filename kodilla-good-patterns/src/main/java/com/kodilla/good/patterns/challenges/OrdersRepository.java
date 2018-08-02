package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrdersRepository implements CommerceRepository{

    public boolean createOrder(Customer customer, Product product, LocalDate orderDate) {
        System.out.println("Order created: "
                + customer.toString()
                + product.toString()
                + orderDate.toString());
        return true;
    }
}
