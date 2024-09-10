package org.example.first;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Количество цифр в числе: " + count);
    }
}
