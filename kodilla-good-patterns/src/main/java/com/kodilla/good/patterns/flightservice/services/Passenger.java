package com.kodilla.good.patterns.flightservice.services;

public class Passenger {
    private String paxName;
    private String paxEmail;
    private long paxPhoneNumber;

    public String getPaxName() {
        return paxName;
    }

    public String getPaxEmail() {
        return paxEmail;
    }

    public long getPaxPhoneNumber() {
        return paxPhoneNumber;
    }

    public void setPaxName(String paxName) {
        this.paxName = paxName;
    }

    public void setPaxEmail(String paxEmail) {
        this.paxEmail = paxEmail;
    }

    public void setPaxPhoneNumber(long paxPhoneNumber) {
        this.paxPhoneNumber = paxPhoneNumber;
    }

    @Override
    public String toString() {
        return "Passenger: " + "\n" +
                "name: " + paxName + "\n" +
                "email: " + paxEmail + "\n" +
                "phone number: " + paxPhoneNumber + "\n";
    }
}
