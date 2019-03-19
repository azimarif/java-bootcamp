package com.step.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DimensionTest {
    @Test
    void shouldThrowExceptionIfTheSideIsLessThanZero() {
        assertThrows(InvalidSideException.class, () -> new Dimension(-1));
    }

    @Test
    void shouldReturnTheSide() throws InvalidSideException {
        Dimension dimension = new Dimension(4);
        assertEquals(4, dimension.getValue());
    }
}