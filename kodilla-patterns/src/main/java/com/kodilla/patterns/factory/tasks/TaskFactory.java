package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";

    public final Task executeTask(String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Driving task", "destination", null);
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping task", "beer", 3.0);
            case PAINTING_TASK:
                return new PaintingTask("Painting task", "white", null);
            default:
                return null;
        }
    }
}
