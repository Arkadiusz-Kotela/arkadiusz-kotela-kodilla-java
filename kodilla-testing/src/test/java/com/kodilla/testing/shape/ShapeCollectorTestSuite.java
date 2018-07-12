package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector(new ArrayList<Shape>());
        Circle circle = new Circle("Circle", 12.34);

        //When
        collector.addFigure(circle);

        //Then
        Assert.assertEquals(collector.getFigure(0), circle);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector(new ArrayList<Shape>());
        Circle circle = new Circle("Circle", 12.34);
        collector.addFigure(circle);

        //When
        collector.removeFigure(circle);

        //Then
        Assert.assertNull(collector.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector(new ArrayList<Shape>());
        Circle circle = new Circle("Circle", 12.34);
        collector.addFigure(circle);

        //When
        Shape result = collector.getFigure(0);

        //Then
        Assert.assertEquals(result, circle);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector(new ArrayList<Shape>());
        Circle circle = new Circle("Circle", 12.34);
        collector.addFigure(circle);

        //When
        String result = collector.getFigure(0).toString();

        //Then
        Assert.assertEquals(result, circle.toString());
    }

}
