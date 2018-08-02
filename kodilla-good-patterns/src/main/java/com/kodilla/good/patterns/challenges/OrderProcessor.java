package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderProcessor {
    private InformationService informationService;
    private CommerceService commerceService;
    private CommerceRepository commerceRepository;

    public OrderProcessor(final InformationService informationService,
                          final CommerceService commerceService,
                          final CommerceRepository commerceRepository) {
        this.informationService = informationService;
        this.commerceService = commerceService;
        this.commerceRepository = commerceRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = commerceService.order(orderRequest.getCustomer(),
                orderRequest.getProduct(), orderRequest.getOrderDate());

        if (isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            commerceRepository.createOrder(orderRequest.getCustomer(),
                    orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getCustomer(),
                    orderRequest.getProduct(), orderRequest.getOrderDate(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(),
                    orderRequest.getProduct(), orderRequest.getOrderDate(),false);
        }
    }
}









