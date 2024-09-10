package org.example.second;

public class task4 {
    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150");
        }
    }
}
