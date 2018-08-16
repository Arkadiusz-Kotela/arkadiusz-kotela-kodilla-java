package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuild() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Yummy")
                .ingredient("Onion")
                .sauce("Garlic")
                .ingredient("Tomato")
                .ingredient("Another ingredient")
                .build();
        System.out.println(bigmac);

        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        String bunName = bigmac.getBun();

        //Then
        Assert.assertEquals(3, numberOfIngredients);
        Assert.assertEquals("Yummy", bunName);

    }
}
