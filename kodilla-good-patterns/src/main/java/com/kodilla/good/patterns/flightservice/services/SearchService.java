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

        //part 1
        System.out.println("Destination available from " + dep + ": " + outbounds);
        //part 2
        System.out.println("Flight from origin to " + dep + ": " + findFlightsToDestination(dep));
        //part 3
        System.out.println(findTransferConnection(dep, dest, trans));

        return outbounds.stream().anyMatch(s -> s.equals(searchRequest.getArrival()));

    }

    public List<String> findFlightsToDestination(String destination) {
        FlightNetwork flightNetwork = FlightNetwork.getInstance();

        List<String> airports = flightNetwork.getAirports()
                .stream()
                .filter(p -> p.getDestinations().contains(destination))
                .map(Airport::getIataCode)
                .collect(Collectors.toList());

        return airports;
    }

    public boolean findTransferConnection(String departure, String destination, String transfer) {
        List<String> transferVia = findFlightsToDestination(departure);

        if (transferVia.isEmpty()) {
            System.out.println("No transfer available via: " + transfer);
            return false;
        } else {
            for (String flt : transferVia) {
//                System.out.println("Airport: " + flt);
//                System.out.println("Flights to " + flt + ": " + findFlightsToDestination(flt));
                findFlightsToDestination(flt);
            }
            System.out.println("Transfer available via: " + transfer);

            return true;
        }
    }


//        if (list.contains(transfer)) {
////                while (!list.isEmpty()) {
////                findFlightsToDestination(destination);
////            }
////            System.out.println("Transfer flight: " + departure + " --> " + destination + " via " + transfer);
//            return true;
//        } else {
//            System.out.println("No transfer flight: " + departure + " --> " + destination + " via " + transfer);
//            return false;
//        }
}
