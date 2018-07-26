package com.kodilla.exception.test;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String deprtureAirport, String arraivalAirport) {
        this.departureAirport = deprtureAirport;
        this.arrivalAirport = arraivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }


}
