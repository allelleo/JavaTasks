package org.example.first;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A = scanner.nextInt();
        System.out.print("Введите число B: ");
        int B = scanner.nextInt();

        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма четных чисел от " + A + " до " + B + " = " + sum);
    }
}
