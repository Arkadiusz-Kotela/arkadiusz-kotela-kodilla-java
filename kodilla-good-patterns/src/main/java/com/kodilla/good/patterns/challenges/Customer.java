package com.kodilla.good.patterns.challenges;

import java.io.Serializable;
import java.util.Objects;

class Customer implements Serializable {

    private static final long serialVersionUID = -5074212843404132531L;
    private final String firstName;
    private final String lastName;

    public Customer(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
