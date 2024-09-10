package org.example.second;



public class task5 {
    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно найти корень из отрицательного числа");
        }
        return Math.sqrt(number);
    }
}
