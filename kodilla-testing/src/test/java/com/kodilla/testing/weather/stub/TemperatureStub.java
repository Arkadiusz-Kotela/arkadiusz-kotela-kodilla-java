package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperatureStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();

        stubResult.put(0, 1.20);
        stubResult.put(1, 1.21);
        stubResult.put(2, 1.22);
        stubResult.put(3, 1.23);
        stubResult.put(4, 1.24);

        return stubResult;
    }
}
