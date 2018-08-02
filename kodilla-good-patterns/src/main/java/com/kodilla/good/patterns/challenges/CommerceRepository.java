package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface CommerceRepository {
    boolean createOrder(Customer customer, Product product, LocalDate orderDate);
}
