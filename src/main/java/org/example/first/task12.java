package org.example.first;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сумма цифр числа = " + sum);
    }
}
