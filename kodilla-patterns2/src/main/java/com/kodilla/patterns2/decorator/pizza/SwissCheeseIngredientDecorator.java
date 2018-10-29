package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SwissCheeseIngredientDecorator extends AbstractPizzaOrderDecorator {
    public SwissCheeseIngredientDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("2.50"));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + swiss cheese";
    }
}
