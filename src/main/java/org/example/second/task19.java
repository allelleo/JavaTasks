package org.example.second;


public class task19 {
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return celsius * 9/5 + 32;
    }
}
