package org.example.first;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int positiveCount = 0, negativeCount = 0;
        for (int i : array) {
            if (i > 0) {
                positiveCount++;
            } else if (i < 0) {
                negativeCount++;
            }
        }

        System.out.println("Положительных чисел: " + positiveCount);
        System.out.println("Отрицательных чисел: " + negativeCount);
    }
}
