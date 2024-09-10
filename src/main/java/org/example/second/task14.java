package org.example.second;


public class task14 {
    public static void checkPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком короткий");
        }
    }
}
