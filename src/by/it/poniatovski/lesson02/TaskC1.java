package by.it.poniatovski.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        System.out.println ("Введите 2 числа ");

        int a = k.nextInt();
        int b = k.nextInt();
        System.out.println("Sum = " + (a + b));

    }





}
