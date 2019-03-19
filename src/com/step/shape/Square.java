package com.step.shape;


public class Square implements Shape {
    private Dimension side;

    public Square(Dimension side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side.getValue() * side.getValue();
    }

    @Override
    public double calculatePerimeter() {
        return 4 * (side.getValue());
    }
}
