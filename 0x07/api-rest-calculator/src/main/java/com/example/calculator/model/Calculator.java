package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {

    public Double sum(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return number1 + number2;
    }

    public Double sub(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return number1 - number2;
    }

    public Double divide(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        if (number2 == 0.0) {
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }
        return number1 / number2;
    }

    public Integer factorial(Integer factorial) {
        if (factorial == null) {
            throw new NullPointerException("Número é obrigatório.");
        }
        if (factorial < 0) {
            throw new ArithmeticException("Fatorial de número negativo não é permitido.");
        }
        int result = 1;
        for (int i = 2; i <= factorial; i++) {
            result *= i;
        }
        return result;
    }

    // Exemplos:
    // 1 -> 1
    // 5 -> 101
    // 20 -> 10100
    public Integer integerToBinary(Integer integer) {
        if (integer == null) {
            throw new NullPointerException("Número é obrigatório.");
        }
        String binary = Integer.toBinaryString(integer);
        return Integer.valueOf(binary);
    }

    // Exemplos:
    // 1 -> "1"
    // 5 -> "5"
    // 170 -> "AA"
    public String integerToHexadecimal(Integer integer) {
        if (integer == null) {
            throw new NullPointerException("Número é obrigatório.");
        }
        return Integer.toHexString(integer).toUpperCase();
    }

    // Exemplo:
    // date1 = 2020-03-15
    // date2 = 2020-03-29
    // resultado = 14
    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
        if (date1 == null || date2 == null) {
            throw new NullPointerException("Datas são obrigatórias.");
        }
        long days = ChronoUnit.DAYS.between(date1, date2);
        return (int) days;
    }
}