package org.example.first;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
