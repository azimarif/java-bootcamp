package com.step.probability;

class Probability {
    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 1;
    private final double value;

    Probability(double value) throws InvalidProbabilityException {
        this.isValidProbability(value);
        this.value = value;
    }

    private void isValidProbability(double value) throws InvalidProbabilityException {
        if (value < LOWER_BOUND || value > UPPER_BOUND) {
            throw new InvalidProbabilityException("Invalid Probability");
        }
    }

    Probability not() throws InvalidProbabilityException {
        return new Probability(UPPER_BOUND - this.value);
    }

    @Override
    public boolean equals(Object probability) {
        if (this == probability) return true;
        if (probability == null || getClass() != probability.getClass()) return false;
        Probability that = (Probability) probability;
        return Double.compare(that.value, value) == 0;
    }


    Probability and(Probability secondProbability) throws InvalidProbabilityException {
        return new Probability(this.value * secondProbability.value);
    }
}