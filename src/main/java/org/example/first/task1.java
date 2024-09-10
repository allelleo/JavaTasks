package org.example.first;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " - четное число");
        } else {
            System.out.println(number + " - нечетное число");
        }
    }
}