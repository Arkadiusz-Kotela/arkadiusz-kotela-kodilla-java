package com.kodilla.good.patterns.flightservice.services;

import java.time.LocalDate;

public class SearchRequest {
    private Passenger passenger;
    private String departure;
    private String arrival;
    private LocalDate searchDate;

    public SearchRequest(final Passenger passenger,
                         final String departure,
                         final String arrival,
                         final LocalDate searchDate) {
        this.passenger = passenger;
        this.departure = departure;
        this.arrival = arrival;
        this.searchDate = searchDate;
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
}
