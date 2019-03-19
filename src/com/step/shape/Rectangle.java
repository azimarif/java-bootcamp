package com.step.shape;

class Rectangle {
    private Dimension length;
    private Dimension breadth;

    public Rectangle(Dimension length, Dimension breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return this.length.getValue() * this.breadth.getValue();
    }

    public double calculatePerimeter() {
        return 2 * (this.length.getValue() + this.breadth.getValue());
    }
}
