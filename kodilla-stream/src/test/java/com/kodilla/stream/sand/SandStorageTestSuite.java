package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeanQuantity(){
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Africa());
        continents.add(new Asia());
        continents.add(new Europe());

        //When
        BigDecimal sandsTotal = BigDecimal.ZERO;
        for (SandStorage continent : continents){
            sandsTotal = sandsTotal.add(continent.getSandsBeanQuantity());
        }

        //Then
        BigDecimal expectedSandTotal = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSandTotal, sandsTotal);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce(){
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Africa());
        continents.add(new Asia());
        continents.add(new Europe());

        //When
        BigDecimal sandsTotal = continents.stream()
                .map(SandStorage::getSandsBeanQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


        //Then
        BigDecimal expectedSandTotal = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSandTotal, sandsTotal);
    }
}
