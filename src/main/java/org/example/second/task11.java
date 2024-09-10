package org.example.second;


public class task11 {
    public static String toBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        return Integer.toBinaryString(number);
    }
}
