package org.example.first;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + N + " = " + factorial);
    }
}
