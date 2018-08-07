package com.kodilla.good.patterns.flightservice.services;

import com.kodilla.good.patterns.flightservice.InformationService;

public class InfoService implements InformationService {

    @Override
    public void inform(SearchRequest searchRequest) {
        System.out.println("Order confirmation emailed to the customer: \n"
                + searchRequest.getPassenger().toString() + "\n===============\n"
                + "Departure:\n"
                + searchRequest.getDeparture().toUpperCase()
                + "\nArrival:\n"
                + searchRequest.getArrival().toUpperCase());
    }
}
