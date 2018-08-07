package com.kodilla.good.patterns.flightservice.airports;

import java.util.List;
import java.util.Objects;

public class Airport {
    private String iataCode;
    private String airportName;
    private List<String> destinations;

    public Airport(final String iataCode,
                   final String airportName,
                   final List<String> destinations) {
        this.iataCode = iataCode;
        this.airportName = airportName;
        this.destinations = destinations;
    }

    public String getIataCode() {
        return iataCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public List<String> getDestinations() {
        return destinations;
    }

    void addDestination(String dest){
        destinations.add(dest);
    }

    void removeDestination(String dest) {
        destinations.remove(dest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(iataCode, airport.iataCode) &&
                Objects.equals(airportName, airport.airportName) &&
                Objects.equals(destinations, airport.destinations);
    }

    @Override
    public int hashCode() {

        return Objects.hash(iataCode, airportName, destinations);
    }
}
