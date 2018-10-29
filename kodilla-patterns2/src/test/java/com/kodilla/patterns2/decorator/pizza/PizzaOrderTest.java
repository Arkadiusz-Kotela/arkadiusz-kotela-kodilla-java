package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTest {

    @Test
    public void testFullServicePizzaOrderGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new BeaconIngredientDecorator(order);
        order = new HamIngredientDecorator(order);
        order = new SwissCheeseIngredientDecorator(order);
        order = new GarlicSauceDecorator(order);
        order = new ExpressDeliveryDecorator(order);

        //When
        BigDecimal cost = order.getCost();

        //Then
        assertEquals(new BigDecimal("38.50"), cost);
    }

    @Test
    public void testFullServicePizzaOrderGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new BeaconIngredientDecorator(order);
        order = new HamIngredientDecorator(order);
        order = new SwissCheeseIngredientDecorator(order);
        order = new GarlicSauceDecorator(order);
        order = new ExpressDeliveryDecorator(order);

        //When
        String description = order.getDescription();

        //Then
        assertEquals("Pizza with cheese and tomato sauce " +
                "+ beacon + ham + swiss cheese + garlic sauce " +
                "+ express delivery service", description);
    }
}