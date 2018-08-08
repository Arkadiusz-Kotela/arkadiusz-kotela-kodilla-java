package com.kodilla.good.patterns.flightservice.services;

import com.kodilla.good.patterns.flightservice.CommerceService;
import com.kodilla.good.patterns.flightservice.airports.Airport;
import com.kodilla.good.patterns.flightservice.airports.FlightNetwork;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        String dep = searchRequest.getDeparture();
        String dest = searchRequest.getArrival();
        String trans = searchRequest.getTransfer();

//        //part 1
//        System.out.println("Destination available from " + dep + ": " + outbounds);
//        //part 2
//        System.out.println("Flight from origin to " + dep + ": " + findFlightsToDestination(dep));
        //part 3

        System.out.println("Transfer flight from: "
                + dep + " ->> " + dest + " via -> "
                + trans + " is: " + findTransferConnection(dep, trans, dest));

        return outbounds.stream().anyMatch(s -> s.equals(searchRequest.getArrival()));

    }

    public List<String> findFlights(String destinations) {
        FlightNetwork flightNetwork = FlightNetwork.getInstance();

        List<String> airports = flightNetwork.getAirports()
                .stream()
                .filter(p -> p.getDestinations().contains(destinations))
                .map(v -> v.getIataCode())
                .collect(Collectors.toList());

        return airports;
    }

    public String findTransferConnection(String departure, String transfer, String destination) {
//        System.out.println(list);
//        System.out.println("Flights from: " + destination + " " + findFlights(destination));
//        System.out.println("Flights from: " + transfer + " " + findFlights(transfer));
        String result = "";
        for (String flight : findFlights(destination)) {
            if (!flight.equals(transfer)) {
//                System.out.println(flight);
                result = "Unavailable";
            } else {
                for (String flight1 : findFlights(transfer)) {
//                    System.out.println(flight1);
                    if (!flight1.equals(departure)) {
                        result = "Unavailable.";
                    } else {
                        result = "Available";
                    }
                }
            }
        }
        return result;
    }
}
