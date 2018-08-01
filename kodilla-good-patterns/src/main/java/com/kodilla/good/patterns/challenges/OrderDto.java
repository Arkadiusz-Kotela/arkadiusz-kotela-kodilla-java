package com.kodilla.good.patterns.challenges;

class OrderDto {
    private Customer customer;
    private Product product;
    private boolean isAvailable;

    OrderDto(final Customer customer, final Product product, final boolean isAvailable) {
        this.customer = customer;
        this.product = product;
        this.isAvailable = isAvailable;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
