package com.kodilla.good.patterns.food2door;

public class MailService implements InformationService{

    @Override
    public void inform(Customer customer) {
        System.out.println("Order confirmation emailed to the customer: "
                + customer.getCustomerEmail());
    }
}
