package by.it.konovalova.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/


import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {

        int[] array = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
        for (int a = 0; a < 20; a++)
        System.out.print(array[a]+" ");
    }


    public static void sort(int[] array) {
        //int[] array = new int[20];
        //Scanner sc = new Scanner(System.in);
            /*for (int i = 0; i <= 19; i++) {
                array[i] = sc.nextInt();
            }*/
        int t;
        for (int a = 0; a < 20; a++) {
            for (int b = 19; b > a; b--) {
                if (array[b - 1] < array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
            // System.out.print(array[a]+" ");
        }
    }
}



































