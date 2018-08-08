package com.kodilla.good.patterns.flightservice;

import com.kodilla.good.patterns.flightservice.airports.Airport;
import com.kodilla.good.patterns.flightservice.airports.FlightNetwork;
import com.kodilla.good.patterns.flightservice.services.*;

import java.util.Arrays;


public class Application {
    public static void main(String[] args) {

        Airport waw = new Airport("WAW", "Warsaw", Arrays.asList("KTW", "KRK"));
        Airport ktw = new Airport("KTW", "Katowice", Arrays.asList("ORD", "YYZ"));
        Airport krk = new Airport("KRK", "Cracow", Arrays.asList("JFK", "ORD"));
        Airport jfk = new Airport("JFK", "Kenedy", Arrays.asList("AAA", "BBB", "CCC"));

        FlightNetwork flightNetwork = FlightNetwork.getInstance();
        flightNetwork.addAirport(waw);
        flightNetwork.addAirport(ktw);
        flightNetwork.addAirport(krk);
        flightNetwork.addAirport(jfk);



        SearchRequestRetriever srr = new SearchRequestRetriever();
        SearchRequest sr = srr.retrieve();

        SearchProcessor sc = new SearchProcessor(
                new InfoService(),
                new SearchService(),
                new SearchRepository());

        sc.process(sr);
    }
}
