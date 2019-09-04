package by.it.drachov.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int[] m = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= m.length - 1; i++) {
            m[i] = sc.nextInt();
        }

        int t;
        int[] n = new int[10];
        System.arraycopy(m, 0, n, 0, 10);

        for (int a = 1; a < 10; a++) {
            for (int b = 9; b >= a; b--) {
                if (n[b - 1] > n[b]) {
                    t = n[b - 1];
                    n[b - 1] = n[b];
                    n[b] = t;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (m[i] == n[0]) System.out.println("Index of first element=" + (i + 1));

        }
        for (int i = 0; i < 10; i++) {
            if (m[i] == n[9]) System.out.println("Index of last element=" + (i + 1));

        }

    }

}
