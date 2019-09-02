package prikhodko.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add (0, "The first line");
        list.add (1, "The second line");
        list.add (2, "The third line");
        list.add (3, "The fourth line");
        list.add (4, "The fifth line");
        int len = list.size();
        System.out.println(len);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }

}
