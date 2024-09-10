package org.example.first;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
