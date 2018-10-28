package com.kodilla.patterns2.facade.api;

public class ItemDto {
    private final Long itemId;
    private final double quantity;

    public ItemDto(final Long itemId, final double quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public Long getItemId() {
        return itemId;
    }

    public double getQuantity() {
        return quantity;
    }
}
