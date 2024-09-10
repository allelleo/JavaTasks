package org.example.first;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int first = 0, second = 1;

        System.out.print("Первые " + N + " чисел Фибоначчи: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
