package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiNetworkOrderDecorator extends AbstracTaxiOrderDecorator {
    public TaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("35"));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Taxi Network";
    }
}
