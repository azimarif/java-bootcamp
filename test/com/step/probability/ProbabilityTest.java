package com.step.probability;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {
    @Test
    void shouldThrowExceptionForValueLessThanLowerBound() throws InvalidProbabilityException {
        assertThrows(InvalidProbabilityException.class, () -> new Probability(-0.5D));
    }

    void shouldThrowExceptionForValueGreaterThanUpperBound() throws InvalidProbabilityException {
        assertThrows(InvalidProbabilityException.class, () -> new Probability(1.5D));
    }

    @Test
    void shouldRepresentProbability() {
        Assertions.assertDoesNotThrow(() -> new Probability(0.5D));
    }

    @Test
    void shouldReturnImprobability() throws InvalidProbabilityException {
        Probability probability = new Probability(0.4D);
        Probability expected = new Probability(0.6D);
        assertEquals(expected, probability.calculateImprobability());
    }

}