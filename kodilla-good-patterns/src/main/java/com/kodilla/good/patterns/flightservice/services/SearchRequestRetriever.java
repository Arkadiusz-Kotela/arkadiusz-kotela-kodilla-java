package com.kodilla.good.patterns.flightservice.services;

import java.time.LocalDate;
import java.util.Scanner;

public class SearchRequestRetriever {
    private static final Scanner SC = new Scanner(System.in);
    private Passenger passenger = new Passenger();
    private String departure;
    private String arrival;
    private LocalDate searchDate;

    public SearchRequest retrieve() {
        System.out.print("Enter your name: ");
        passenger.setPaxName(SC.nextLine());
        System.out.print("Enter your email: ");
        passenger.setPaxEmail(SC.nextLine());
        System.out.print("Enter your phone number: ");
        passenger.setPaxPhoneNumber(enteredIntChecker());

        System.out.print("Enter departure airport: ");
        departure = enteredAirportCodeChecker().toUpperCase();

        System.out.print("Enter arrival airport: ");
        arrival = enteredAirportCodeChecker().toUpperCase();

        searchDate = LocalDate.now();

        return new SearchRequest(
                passenger,
                departure,
                arrival,
                searchDate);
    }

    long enteredIntChecker() {
        boolean end = false;
        long value = 0;
        do {
            if (!SC.hasNextLong()) {
                System.out.print("Phone number must be numeric value: ");
                SC.next();
            } else {
                value = SC.nextLong();
                end = true;
            }
        } while (!end);
        return value;
    }


    String enteredAirportCodeChecker() {
        boolean end = false;
        String code = SC.next();

        do {
            if (code.length() != 3) {
                System.out.println("IATA three letter code please: ");
                code = SC.next();
            } else {
                end = true;
            }
        } while (!end);

        return code;
    }


}
