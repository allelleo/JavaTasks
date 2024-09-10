package org.example.first;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int originalNumber = number, sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " - число Армстронга.");
        } else {
            System.out.println(originalNumber + " - не является числом Армстронга.");
        }
    }
}
