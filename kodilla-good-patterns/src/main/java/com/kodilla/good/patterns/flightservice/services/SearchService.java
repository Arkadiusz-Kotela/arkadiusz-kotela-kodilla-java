package com.kodilla.good.patterns.flightservice.services;

import com.kodilla.good.patterns.flightservice.CommerceService;
import com.kodilla.good.patterns.flightservice.airports.Airport;
import com.kodilla.good.patterns.flightservice.airports.FlightNetwork;

import java.util.Collections;
import java.util.List;

public class SearchService implements CommerceService {


    @Override
    public boolean search(SearchRequest searchRequest) {

        FlightNetwork flightNetwork = FlightNetwork.getInstance();

        //find all flight from given destination
        List<String> outbounds = flightNetwork.getAirports()
                .stream()
                .filter(p -> p.getIataCode().equalsIgnoreCase(searchRequest.getDeparture()))
                .findFirst()
                .map(Airport::getDestinations).orElse(Collections.emptyList());

        if (outbounds.isEmpty()) {
            System.out.println("Not found");
            throw new NullPointerException();
        }

        /**
         * tu jest dead end. probowalem roznych opcji ale nie rozumiem do konca co mam przekazac
         * do czego i jaka metode ze strima zastosowac
         */
        System.out.println("Destination available from " + searchRequest.getDeparture() + ": " + outbounds);
        return outbounds.stream().anyMatch(s -> s.equals(searchRequest.getArrival()));

    }
}