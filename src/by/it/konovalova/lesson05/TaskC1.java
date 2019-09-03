package by.it.konovalova.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> List = new ArrayList<Integer>(20);
        List<Integer> List3 = new ArrayList<Integer>();
        List<Integer> List2 = new ArrayList<Integer>();
        List<Integer> List1 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            List.add(i, sc.nextInt());
        }


        for (int i = 0; i < 20; i++) {
            if (List.get(i) % 3 == 0) List3.add(List.get(i));
        }


        for (int i = 0; i < 20; i++) {
            if (List.get(i) % 2 == 0) List2.add(List.get(i));
        }


        for (int i = 0; i < 20; i++) {
            if (List.get(i) % 2 != 0 && List.get(i) % 3 != 0) List1.add(List.get(i));
        }
        printList(List3);
        printList(List2);
        printList(List1);
    }


    private static void printList(List<Integer> List3) {

        for (Integer aList : List3)
            System.out.println(aList);

    }
}



