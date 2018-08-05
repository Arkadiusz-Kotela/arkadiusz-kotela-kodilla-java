package com.kodilla.good.patterns.flightservice;

import com.kodilla.good.patterns.flightservice.services.Passenger;

import java.time.LocalDate;

public interface CommerceRepository {
    boolean createSearchRequest(Passenger passenger,
                                String departure,
                                String arrival,
                                LocalDate searchDate);
}
