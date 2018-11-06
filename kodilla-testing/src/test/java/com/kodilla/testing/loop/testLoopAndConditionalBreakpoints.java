package com.kodilla.testing.loop;

import org.junit.Assert;
import org.junit.Test;

public class testLoopAndConditionalBreakpoints {
    @Test
    public void testLoop() {
        //Given
        long sum = 0;

        //When
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.println("[" + i + "] Sum equals: " + sum);
        }

        //Then
        Assert.assertEquals(499500, sum);
    }
}
