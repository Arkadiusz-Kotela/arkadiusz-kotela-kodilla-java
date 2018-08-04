package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.services.*;
import com.kodilla.good.patterns.food2door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.suppliers.HealthFood;
import com.kodilla.good.patterns.food2door.suppliers.JunkFood;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever(
                new Customer("John", "Doe", "john.doe@aaa.com"),
                new ExtraFoodShop("Extra food shop","Something to eat"),
                5,
                LocalDate.now());

        OrderRequestRetriever orderRequestRetriever1 = new OrderRequestRetriever(
                new Customer("Al", "Pacinoski", "al.pacinoski@bbb.com"),
                new HealthFood("Healthy food","Spicy soups"),
                3,
                LocalDate.now());

        OrderRequestRetriever orderRequestRetriever2 = new OrderRequestRetriever(
                new Customer("Robert", "Denirowski", "rober.Denirowski@ccc.com"),
                new JunkFood("Junk Food","Garbage food"),
                5,
                LocalDate.now());


        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderRequest orderRequest1 = orderRequestRetriever1.retrieve();
        OrderRequest orderRequest2 = orderRequestRetriever2.retrieve();

        OrderProcessor orderProcessor =
                new OrderProcessor(
                        new MailService(),
                        new OrderService(),
                        new OrdersRepository());

        orderProcessor.process(orderRequest);
        orderProcessor.process(orderRequest1);
        orderProcessor.process(orderRequest2);
    }

}
