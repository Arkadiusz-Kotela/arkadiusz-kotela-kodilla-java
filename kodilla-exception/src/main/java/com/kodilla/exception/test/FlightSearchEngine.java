package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightSchedule = new HashMap<>();

        flightSchedule.put("Warsaw", false);
        flightSchedule.put("Moscow", false);
        flightSchedule.put("Berlin", true);

        for (Map.Entry<String, Boolean> item : flightSchedule.entrySet()) {
            if (item.getKey().equals(flight.getArrivalAirport()))
                if (!item.getValue()) {
                    throw new RouteNotFoundException();
                }
        }
    }
}
