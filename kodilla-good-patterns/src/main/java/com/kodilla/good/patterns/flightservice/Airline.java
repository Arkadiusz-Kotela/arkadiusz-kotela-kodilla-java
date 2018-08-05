package com.kodilla.good.patterns.flightservice;

import java.util.HashMap;

public abstract class Airline {
    private String airlineName;
    private HashMap<String, String[]> flights;

    public Airline(String airlineName, HashMap<String, String[]> flights) {
        this.airlineName = airlineName;
        this.flights = flights;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public HashMap<String, String[]> getFlights() {
        return flights;
    }

}
