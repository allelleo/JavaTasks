package org.example.second;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class task15 {
    public static void validateDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты", date, 0);
        }
    }
}
