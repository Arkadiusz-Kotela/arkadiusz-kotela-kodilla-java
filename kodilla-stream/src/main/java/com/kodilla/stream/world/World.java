package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    public final List<List<Country>> world = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(List::stream)
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void add(List<Country> continent) {
        world.add(continent);
    }
}
