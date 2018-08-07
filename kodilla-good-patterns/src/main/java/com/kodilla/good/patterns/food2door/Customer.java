package com.kodilla.good.patterns.food2door;

public class Customer {
    private final String customerFirstName;
    private final String customerLastName;
    private final String customerEmail;

    public Customer(final String customerFirstName,
                    final String customerLastName,
                    final String customerEmail) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}
