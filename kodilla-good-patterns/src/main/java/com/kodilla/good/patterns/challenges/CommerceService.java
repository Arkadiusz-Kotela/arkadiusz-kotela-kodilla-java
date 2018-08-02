package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface CommerceService {
    boolean order(Customer customer, Product product, LocalDate orderDate);
}
