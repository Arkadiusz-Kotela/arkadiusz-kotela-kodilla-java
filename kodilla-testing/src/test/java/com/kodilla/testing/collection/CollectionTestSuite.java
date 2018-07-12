package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();

        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> exterminateOdd = exterminator.exterminate(numbers);
        ArrayList<Integer> result = null;

        //Then
        Assert.assertEquals(exterminateOdd, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }

        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> exterminateOdd = exterminator.exterminate(numbers);

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }

        //Then
        Assert.assertEquals(exterminateOdd, result);

    }
}
