package com.kodilla.good.patterns.flightservice.services;


import com.kodilla.good.patterns.flightservice.CommerceRepository;
import com.kodilla.good.patterns.flightservice.CommerceService;
import com.kodilla.good.patterns.flightservice.InformationService;

public class SearchProcessor {
    private InformationService informationService;
    private CommerceService commerceService;
    private CommerceRepository commerceRepository;

    public SearchProcessor(final InformationService informationService,
                           final CommerceService commerceService,
                           final CommerceRepository commerceRepository) {
        this.informationService = informationService;
        this.commerceService = commerceService;
        this.commerceRepository = commerceRepository;
    }

    public SearchDto process(final SearchRequest searchRequest) {
        boolean isConnected =
                commerceService.search(searchRequest);

        if (isConnected) {
            informationService.inform(searchRequest);
            commerceRepository.createSearchRequest(
                    searchRequest.getPassenger(),
                    searchRequest.getDeparture(),
                    searchRequest.getArrival(),
                    searchRequest.getSearchDate()
            );
            return new SearchDto(
                    searchRequest.getPassenger(),
                    searchRequest.getDeparture(),
                    searchRequest.getArrival(),
                    searchRequest.getSearchDate(),
                    true
            );
        } else {
            return new SearchDto(
                    searchRequest.getPassenger(),
                    searchRequest.getDeparture(),
                    searchRequest.getArrival(),
                    searchRequest.getSearchDate(),
                    false
            );
        }
    }
}










