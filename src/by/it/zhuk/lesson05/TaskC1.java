package by.it.zhuk.lesson05;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {

//    public static void main(String[] args) throws Exception
//   {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList <Integer> list = new ArrayList<>();
//        ArrayList <Integer> list3 = new ArrayList<Integer>(); // %3==0
//        ArrayList <Integer> list2 = new ArrayList<Integer>(); // %2==0
//        ArrayList <Integer> listelse = new ArrayList<Integer>(); // other
//
//        int size = list.size();
//        while (size < 20)
//       {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            list.add(Integer.parseInt(s));
//        }
//        int j;
//        for (j = 0; j < size; j++) {
//            int x = list.get(j);
//            if (x%3 == 0)
//                list3.add(x);
//            else if (x%2 == 0)
//                list2.add(x);
//            else
//                listelse.add(x);
//        }
//        printList(list3);
//        printList(list2);
//        printList(listelse);
//    }
//
//    private static void printList(List<Integer> list) {
//        for (Integer aList : list) System.out.println(aList);
//    }


}
