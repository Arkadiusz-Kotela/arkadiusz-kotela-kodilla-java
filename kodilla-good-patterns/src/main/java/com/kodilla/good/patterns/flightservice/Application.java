package com.kodilla.good.patterns.flightservice;

import com.kodilla.good.patterns.flightservice.airports.Airport;
import com.kodilla.good.patterns.flightservice.airports.FlightNetwork;
import com.kodilla.good.patterns.flightservice.services.*;

import java.util.Arrays;


public class Application {
    public static void main(String[] args) {

        Airport waw = new Airport("WAW", "Warsaw", Arrays.asList("LDZ", "POZ", "KRK", "SCZ"));
        Airport ktw = new Airport("KTW", "Katowice", Arrays.asList("WAW", "ORD", "YYZ", "KRK"));
        Airport krk = new Airport("KRK", "Cracow", Arrays.asList("WAW", "LDZ", "POZ", "RZE", "JFK"));

        FlightNetwork flightNetwork = FlightNetwork.getInstance();
        flightNetwork.addAirport(waw);
        flightNetwork.addAirport(ktw);
        flightNetwork.addAirport(krk);



        SearchRequestRetriever srr = new SearchRequestRetriever();
        SearchRequest sr = srr.retrieve();

        SearchProcessor sc = new SearchProcessor(
                new InfoService(),
                new SearchService(),
                new SearchRepository());

        sc.process(sr);
    }
}
