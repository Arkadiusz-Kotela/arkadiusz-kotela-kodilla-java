package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        List<List<Country>> world = new ArrayList<>();
        List<Country> continent1 = new ArrayList<>();
        List<Country> continent2 = new ArrayList<>();
        List<Country> continent3 = new ArrayList<>();

        Country country1 = new Country(new BigDecimal("1234"));
        Country country2 = new Country(new BigDecimal("1234"));
        Country country3 = new Country(new BigDecimal("1234"));
        Country country4 = new Country(new BigDecimal("1234"));
        Country country5 = new Country(new BigDecimal("1234"));
        Country country6 = new Country(new BigDecimal("1234"));
        Country country7 = new Country(new BigDecimal("1234"));
        Country country8 = new Country(new BigDecimal("1234"));
        Country country9 = new Country(new BigDecimal("1234"));

        continent1.add(country1);
        continent1.add(country2);
        continent1.add(country3);
        continent2.add(country4);
        continent2.add(country5);
        continent2.add(country6);
        continent3.add(country7);
        continent3.add(country8);
        continent3.add(country9);

        world.add(continent1);
        world.add(continent2);
        world.add(continent3);


        //When
        BigDecimal worldPopulation = world.stream() // Stream<List<Country>>
                .flatMap(List::stream) // Stream<Country>
                .map(Country::getPopulation) //Stream<BigDecimal>
                .reduce(BigDecimal.ZERO, BigDecimal::add); //BigDecimal;


        //Then
        BigDecimal expectedWorldPopulation = new BigDecimal("11106");
        Assert.assertEquals(expectedWorldPopulation, worldPopulation);

    }
}
