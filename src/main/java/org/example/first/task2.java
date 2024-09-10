package org.example.first;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        int min = Math.min(a, Math.min(b, c));

        System.out.println("Минимальное число: " + min);
    }
}

