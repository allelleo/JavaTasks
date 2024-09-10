package org.example.second;

public class task3 {
    public static int convert(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Невозможно конвертировать строку в число");
        }
    }
}
