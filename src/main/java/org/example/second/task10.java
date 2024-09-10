package org.example.second;


public class task10 {
    public static int findElement(int[] array, int element) {
        for (int i : array) {
            if (i == element) {
                return i;
            }
        }
        throw new IllegalArgumentException("Элемент не найден в массиве");
    }
}
