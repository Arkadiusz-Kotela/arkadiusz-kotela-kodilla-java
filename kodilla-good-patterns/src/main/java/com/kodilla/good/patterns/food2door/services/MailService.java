package com.kodilla.good.patterns.food2door.services;

import com.kodilla.good.patterns.food2door.Customer;
import com.kodilla.good.patterns.food2door.InformationService;

public class MailService implements InformationService {

    @Override
    public void inform(Customer customer) {
        System.out.println("Order confirmation emailed to the customer: "
                + customer.getCustomerEmail());
    }
}
