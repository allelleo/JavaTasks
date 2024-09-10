package org.example.second;


public class task12 {
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b == 0;
    }
}
