package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;
    private Double field;

    public Circle(String shapeName, Double field) {
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
        return "Circle{" +
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
