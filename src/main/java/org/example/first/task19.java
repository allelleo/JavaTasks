package org.example.first;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println("Строка с перестановкой слов: " + reversed.toString().trim());
    }
}
