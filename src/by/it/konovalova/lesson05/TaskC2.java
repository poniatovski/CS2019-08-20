package by.it.konovalova.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {

        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }

    private static void sort(int[] array) {
        int t;
        for (int a = 0; a < 20; a++) {
            for (int b = 19; b > a; b--) {
                if (array[b - 1] < array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }
    }
}



































