package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    Double field;

    public Square(String shapeName, Double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }

    @Override
    public String getShapeName(String shapeName) {
        return this.shapeName;
    }

    @Override
    public Double getField(Double filed) {
        return this.field;
    }
}
