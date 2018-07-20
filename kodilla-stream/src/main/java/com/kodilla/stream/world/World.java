package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    public final List<Continent> listOfContinents = new ArrayList<>();

    public BigDecimal getPopulation() {
        BigDecimal result = listOfContinents.stream()
                .map(Continent::getListOfCountries)
                .flatMap(List::stream)
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return result;
    }
}
