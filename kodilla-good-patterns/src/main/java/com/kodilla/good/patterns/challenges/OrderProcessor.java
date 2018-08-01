package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    OrderDto process(OrderRequest orderRequest) {
        boolean isAvailable = orderRequest.getProduct().isAvailable();
        informationService.inform(orderRequest.getCustomer());
        orderRepository.createOrder(
                orderRequest.getCustomer(),
                orderRequest.getProduct(),
                orderRequest.getOrderDate());
        if (isAvailable) {
            return new OrderDto(
                    orderRequest.getCustomer(),
                    orderRequest.getProduct(),
                    true);
        } else {
            return new OrderDto(
                    orderRequest.getCustomer(),
                    orderRequest.getProduct(),
                    false);
        }
    }
}
