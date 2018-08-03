package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public interface CommerceRepository {
    boolean createOrder(Customer customer, Supplier supplier, int foodNameQuantity, LocalDate orderDate);
}
