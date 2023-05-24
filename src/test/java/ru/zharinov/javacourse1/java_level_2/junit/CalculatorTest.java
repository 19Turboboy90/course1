package ru.zharinov.javacourse1.java_level_2.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sum() {
        int expected = 15;
        int result = calculator.sum(10, 5);
        assertEquals(expected, result);
    }

    @Test
    public void multiple() {
        assertEquals(100, calculator.multiple(20, 5), 0.001);
    }

    @Test
    public void subtraction() {
        assertEquals(15, calculator.subtraction(20, 5));
    }

    @Test
    public void divide() {
        assertEquals(4, calculator.divide(20, 5), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
        assertEquals(0, calculator.divide(20, 0), 0.001);
    }

    @Test
    public void square() {
        assertEquals(4, calculator.square(2), 0.001);
    }
}