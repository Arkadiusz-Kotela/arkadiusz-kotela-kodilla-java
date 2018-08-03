package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public interface CommerceService {
    boolean order(
            Customer customer,
            Supplier supplier,
            int foodNameQuantity,
            LocalDate orderDate);
}
