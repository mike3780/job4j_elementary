package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDiv(double first, double second) {
        return minus(first, second) + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + minus(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма сложения двух чисел и произведения двух чисел: "
                + sumAndMultiply(10, 20));
        System.out.println("Сумма разности двух чисел и деления двух чисел: "
                + minusAndDiv(10, 20));
        System.out.println("Сумма вычисления всех четырех операций: "
                + sumAll(10, 20));
    }
}
