package by.it.poniatovski.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = sr.nextInt();
        int d = sr.nextInt();
        System.out.println("DEC:34+26=" + (a + d));
        System.out.println("BIN:100010+11010=" + Integer.toBinaryString(a + d));
        System.out.println("HEX:22+1a=" + Integer.toHexString(a + d));
        System.out.println("OCT:42+32=" + Integer.toOctalString(a + d));

    }


}





















