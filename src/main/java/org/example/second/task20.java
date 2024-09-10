package org.example.second;


public class task20 {
    public static void validateString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пуста или равна null");
        }
    }
}
