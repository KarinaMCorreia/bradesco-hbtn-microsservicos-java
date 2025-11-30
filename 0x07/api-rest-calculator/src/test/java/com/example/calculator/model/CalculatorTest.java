package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        Double result = calculator.sum(10.0, 5.0);
        assertEquals(15.0, result);
    }

    @Test
    public void numbersNullSumTest() {
        NullPointerException ex = assertThrows(
                NullPointerException.class,
                () -> calculator.sum(null, 5.0)
        );
        assertEquals("Número 1 e número 2 são obrigatórios.", ex.getMessage());
    }

    @Test
    void subTest() {
        Double result = calculator.sub(10.0, 4.0);
        assertEquals(6.0, result);
    }

    @Test
    void divideTest() {
        Double result = calculator.divide(20.0, 4.0);
        assertEquals(5.0, result);
    }

    @Test
    public void divisionByZeroTest() {
        ArithmeticException ex = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10.0, 0.0)
        );
        assertEquals("Divisão por zero não é permitido.", ex.getMessage());
    }

    @Test
    void factorialTest() {
        Integer result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    void integerToBinaryTest() {
        Integer result = calculator.integerToBinary(5);
        // 5 em binário é 101
        assertEquals(101, result);
    }

    @Test
    void integerToHexadecimalTest() {
        String result = calculator.integerToHexadecimal(170);
        // 170 em hex é AA
        assertEquals("AA", result);
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate date1 = LocalDate.of(2020, 3, 15);
        LocalDate date2 = LocalDate.of(2020, 3, 29);
        int days = calculator.calculeDayBetweenDate(date1, date2);
        assertEquals(14, days);
    }
}