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

    Probability calculateImprobability() throws InvalidProbabilityException {
        return new Probability(UPPER_BOUND - this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.value, value) == 0;
    }
}