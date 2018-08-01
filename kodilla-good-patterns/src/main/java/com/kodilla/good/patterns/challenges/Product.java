package com.kodilla.good.patterns.challenges;

class Product {
    private final String productName;
    private int productPrice;
    private int quantity;

    public Product(final String productName, int productPrice, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    boolean isAvailable() {
        return quantity > 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
