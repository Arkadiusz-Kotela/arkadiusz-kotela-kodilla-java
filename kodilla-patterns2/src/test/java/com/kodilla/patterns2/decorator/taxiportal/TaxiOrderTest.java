package com.kodilla.patterns2.decorator.taxiportal;

import net.bytebuddy.dynamic.DynamicType;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTest {
    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal("5.00"), cost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal("40.00"), cost);

    }

    @Test
    public void testTaxiNetworkOrderGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testVipCarWithChildSeatDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }

    @Test
    public void testVipCarWithChildSeatExpressCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);


        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal("60.00"), cost);
    }


}