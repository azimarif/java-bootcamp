package com.step.shape;

class Rectangle implements Shape {
    private Dimension length;
    private Dimension breadth;

    Rectangle(Dimension length, Dimension breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length.getValue() * breadth.getValue();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length.getValue() + breadth.getValue());

    }
}
