package com.kodilla.good.patterns.flightservice.airports;

import java.util.ArrayList;
import java.util.List;

public final class FlightNetwork {
    //singleton field static with reference to itself = null
    private static FlightNetwork flightNetwork = null;
    private List<Airport> airports = new ArrayList<>();

    //private constructor preventing new instance creation
    private FlightNetwork() {
    }

    //
    public static FlightNetwork getInstance() {
        if (flightNetwork == null) {
            synchronized(FlightNetwork.class) {
                if (flightNetwork == null) {
                   flightNetwork = new FlightNetwork();
                }
            }
        }
        return flightNetwork;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void addAirport(Airport airport){
        airports.add(airport);
    }

}
