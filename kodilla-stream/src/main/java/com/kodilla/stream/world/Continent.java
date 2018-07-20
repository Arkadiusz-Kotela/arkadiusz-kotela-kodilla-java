package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    public final List<Country> listOfCountries = new ArrayList<>();

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
