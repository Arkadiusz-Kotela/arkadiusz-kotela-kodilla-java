package com.kodilla.good.patterns.flightservice.services;

import com.kodilla.good.patterns.flightservice.CommerceRepository;

import java.time.LocalDate;

public class SearchRepository implements CommerceRepository {

    @Override
    public boolean createSearchRequest(
            Passenger passenger,
            String departure,
            String arrival,
            LocalDate searchDate) {
        System.out.println("================\nQuery made by:\n"
                + passenger.toString()
                + "on: \n"
                + searchDate + "\n"
                + "Departure: " + departure.toUpperCase() + "\n"
                + "Arrival: " + arrival.toUpperCase());
        return true;
    }
}
