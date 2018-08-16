package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuild() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Yummy")
                .burgers(3)
                .ingredient("Onion")
                .sauce("Garlic")
                .ingredient("Tomato")
                .ingredient("Another ingredient")
                .build();
        System.out.println(bigmac);

        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        int numberOfBurgers = bigmac.getBurgers();
        String bunName = bigmac.getBun();

        //Then
        Assert.assertEquals(3, numberOfIngredients);
        Assert.assertEquals(3, numberOfBurgers);
        Assert.assertEquals("Yummy", bunName);

    }
}
