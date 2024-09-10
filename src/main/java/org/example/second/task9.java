package org.example.second;


public class task9 {
    public static String trim(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Длина строки меньше заданного значения");
        }
        return str.substring(0, length);
    }
}
