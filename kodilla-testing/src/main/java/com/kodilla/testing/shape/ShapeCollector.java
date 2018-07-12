package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes;

    public ShapeCollector(ArrayList<Shape> shapes) {
        this.shapes = shapes;

    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public void showFigures() {

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
