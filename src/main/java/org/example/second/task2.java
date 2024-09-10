package org.example.second;

public class task2 {
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }
}

