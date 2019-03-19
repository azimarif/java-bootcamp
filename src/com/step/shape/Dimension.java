package com.step.shape;

class Dimension {
    private final double side;

    Dimension(double side) throws InvalidSideException {
        this.isValidSide(side);
        this.side = side;
    }

    private void isValidSide(double side) throws InvalidSideException {
        if (side < 0) {
            throw new InvalidSideException("Invalid Side");
        }
    }

    public double getValue() {
        return this.side;
    }
}
