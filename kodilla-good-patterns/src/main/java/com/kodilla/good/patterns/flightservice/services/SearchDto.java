package com.kodilla.good.patterns.flightservice.services;


import java.time.LocalDate;

public class SearchDto {

    private Passenger passenger;
    private String departure;
    private String arrival;
    private LocalDate searchDate;
    private boolean connected;

    public SearchDto(final Passenger passenger,
                     final String departure,
                     final String arrival, final LocalDate searchDate,
                     final boolean connected) {
        this.passenger = passenger;
        this.departure = departure;
        this.arrival = arrival;
        this.searchDate = searchDate;
        this.connected = connected;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public LocalDate getSearchDate() {
        return searchDate;
    }

    public boolean isConnected() {
        return connected;
    }
}