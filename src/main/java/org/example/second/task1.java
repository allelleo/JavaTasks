package org.example.second;


public class task1 {
    public static int max(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны");
        }
        return Math.max(a, b);
    }
}