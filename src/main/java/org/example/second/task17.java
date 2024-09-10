package org.example.second;


public class task17 {
    public static int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a % b;
    }
}
