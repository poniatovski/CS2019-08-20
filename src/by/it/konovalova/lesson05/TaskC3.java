package by.it.konovalova.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Scanner;

public class TaskC3 {

    public static void main(String[] args) {

        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = sc.nextInt();
        }
        sort(array, 0, 19);
        for (int x : array) {
            System.out.println(x);
        }
    }

    private static void sort(int[] array, int left, int right) {
        int li = left;
        int ri = right;
        int med = array[(li + ri) / 2];
        do {
            while (array[li] > med) {
                li++;
            }
            while (array[ri] < med) {
                ri--;
            }
            if (li <= ri) {
                if (li < ri) {
                    int t = array[li];
                    array[li] = array[ri];
                    array[ri] = t;
                }
                li++;
                ri--;
            }
        }
        while (li <= ri);

        if (li < right) {
            sort(array, li, right);
        }
        if (left < ri) {
            sort(array, left, ri);
        }
    }
}
