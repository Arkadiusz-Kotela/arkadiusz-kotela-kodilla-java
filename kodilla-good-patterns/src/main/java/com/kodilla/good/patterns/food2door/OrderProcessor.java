package com.kodilla.good.patterns.food2door;


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
        boolean isOrdered =
                commerceService.order(
                        orderRequest.getCustomer(),
                        orderRequest.getSupplier(),
                        orderRequest.getFoodNameQuantity(),
                        orderRequest.getOrderDate());


        if (isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            commerceRepository.createOrder(
                    orderRequest.getCustomer(),
                    orderRequest.getSupplier(),
                    orderRequest.getFoodNameQuantity(),
                    orderRequest.getOrderDate());
            return new OrderDto(
                    orderRequest.getCustomer(),
                    orderRequest.getSupplier().getSupplierName(),
                    orderRequest.getOrderDate(),
                    true);
        } else {
            return new OrderDto(
                    orderRequest.getCustomer(),
                    orderRequest.getSupplier().getSupplierName(),
                    orderRequest.getOrderDate(),
                    false);
        }
    }
}










