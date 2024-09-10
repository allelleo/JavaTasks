package org.example.first;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Реверс строки: " + reversed);
    }
}
