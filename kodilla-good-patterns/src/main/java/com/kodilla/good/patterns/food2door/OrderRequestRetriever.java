package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Customer customer = new Customer("John",
                "Doe", "john.doe@johndoe.com");
        int foodNameQuantity = 3;
        Supplier supplier = new ExtraFoodShop("Extra Shop Food", "Healthy Food");
        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(
                customer,
                supplier,
                foodNameQuantity,
                orderDate);
    }
}
