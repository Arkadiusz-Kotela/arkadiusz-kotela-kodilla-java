package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Customer customer = new Customer("John",
                "Doe", "john.doe@johndoe.com");
        Product product = new Product("Something", 1234.56);
        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(customer, product, orderDate);
    }
}
