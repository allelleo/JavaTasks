package org.example.first;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
