package com.kodilla.patterns2.facade.api;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    public final List<ItemDto> items = new ArrayList<>();

    public void addItem(final ItemDto itemDto) {
        items.add(itemDto);
    }

    public List<ItemDto> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "items=" + items +
                '}';
    }
}
