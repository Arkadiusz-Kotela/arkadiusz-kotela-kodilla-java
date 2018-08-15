package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public int executeTask() {
        if (whatToPaint.isEmpty()) {
            return 0;
        } else return 1;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executeTask() != 0;
    }
}
