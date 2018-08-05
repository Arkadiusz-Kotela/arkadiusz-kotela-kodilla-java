package com.kodilla.good.patterns.flightservice;

import com.kodilla.good.patterns.flightservice.services.*;

public class Application {
    public static void main(String[] args) {

        SearchRequestRetriever srr = new SearchRequestRetriever();
        SearchRequest sr = srr.retrieve();

        SearchProcessor sc = new SearchProcessor(
                new InfoService(),
                new SearchService(),
                new SearchRepository());

        sc.process(sr);
    }
}
