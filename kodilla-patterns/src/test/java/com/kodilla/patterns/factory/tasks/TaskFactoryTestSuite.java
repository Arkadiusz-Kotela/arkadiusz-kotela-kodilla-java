package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.executeTask(TaskFactory.DRIVING_TASK);

        //Then
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.executeTask(TaskFactory.PAINTING_TASK);

        //Then
        Assert.assertEquals("Painting task", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.executeTask(TaskFactory.SHOPPING_TASK);

        //Then
        Assert.assertEquals("Shopping task", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
