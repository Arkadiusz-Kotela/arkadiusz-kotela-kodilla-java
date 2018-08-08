package com.kodilla.good.patterns.flightservice.service;

import com.kodilla.good.patterns.flightservice.airports.Airport;
import com.kodilla.good.patterns.flightservice.airports.FlightNetwork;
import com.kodilla.good.patterns.flightservice.services.SearchService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FlightServiceTestSuite {
    @Test
    public void testFindTransferConnection() {
        //Given
        Airport waw = new Airport("WAW", "Warsaw", Arrays.asList("LDZ", "POZ", "KRK", "SCZ"));
        Airport ktw = new Airport("KTW", "Katowice", Arrays.asList("WAW", "ORD", "YYZ", "KRK"));
        Airport krk = new Airport("KRK", "Cracow", Arrays.asList("WAW", "LDZ", "POZ", "RZE", "JFK"));

        FlightNetwork flightNetwork = FlightNetwork.getInstance();
        flightNetwork.addAirport(waw);
        flightNetwork.addAirport(ktw);
        flightNetwork.addAirport(krk);

        SearchService service = new SearchService();

        //When
        boolean result = service.findTransferConnection("waw", "jfk", "krk");

        //Then
        Assert.assertTrue(result);
    }
}
