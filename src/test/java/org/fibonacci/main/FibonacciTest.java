package org.fibonacci.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * Fibonacci 0 = 0
 * Fibonacci 1 = 1
 * Fibonacci 2 = 1
 * FIbonacci 3 = 2
 * Fibonacci negativo = error
 */

public class FibonacciTest {
    Fibonacci fb = new Fibonacci();
    @Test
    public void shouldComputeReturnZeroIftheNumberIsZero() {
        int expectedValue = 0;
        int obtainedValue = fb.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIftheNumberIsOne() {
        int expectedValue = 1;
        int obtainedValue = fb.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIftheNumberIsTwo() {
        int expectedValue = 1;
        int obtainedValue = fb.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIftheNumberIsThree() {
        int expectedValue = 2;
        int obtainedValue = fb.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldReturnErrorIfTheNumberIsNegative(){
        assertThrows(RuntimeException.class,()->fb.compute(-1));
    }

}
