package org.example.first;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A = scanner.nextInt();
        System.out.print("Введите число B: ");
        int B = scanner.nextInt();

        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
