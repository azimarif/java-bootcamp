package com.step.probability;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}