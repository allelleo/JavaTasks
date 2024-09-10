package org.example.second;


public class task18 {
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно найти квадратный корень отрицательного числа");
        }
        return Math.sqrt(number);
    }
}
