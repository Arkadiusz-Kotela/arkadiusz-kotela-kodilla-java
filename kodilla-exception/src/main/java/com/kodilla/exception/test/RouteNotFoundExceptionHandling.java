package com.kodilla.exception.test;

public class RouteNotFoundExceptionHandling {
    public static void main(String[] args) {
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        Flight flight = new Flight("Warsaw", "Moscow");

        try {
            flightSearchEngine.findFlight(flight);
            System.out.println("FLIGHT: " + flight.getDepartureAirport() + " --> "
                    + flight.getArrivalAirport() + " available :)");
        } catch (RouteNotFoundException e) {
            System.out.println("FLIGHT: " + flight.getDepartureAirport() + " --> "
                    + flight.getArrivalAirport() + " not found :(");
        } finally {
            System.out.println("Thank you for choosing our Airlines. Have a nice day.");
        }


    }
}
