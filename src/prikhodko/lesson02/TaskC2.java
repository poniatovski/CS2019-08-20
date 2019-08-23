package prikhodko.lesson02;

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
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("DEC:"+a+"+"+b+"="+result);
        String convert = Integer.toBinaryString(a);
        System.out.print("BIN:"+convert+"+");
        convert = Integer.toBinaryString(b);
        System.out.print(convert+"=");
        convert = Integer.toBinaryString(result);
        System.out.println(convert);
        convert = Integer.toHexString(a);
        System.out.print("HEX:"+convert+"+");
        convert = Integer.toHexString(b);
        System.out.print(convert+"=");
        convert = Integer.toHexString(result);
        System.out.println(convert);
        convert = Integer.toOctalString(a);
        System.out.print("OCT:"+convert+"+");
        convert = Integer.toOctalString(b);
        System.out.print(convert+"=");
        convert = Integer.toOctalString(result);
        System.out.print(convert);
    }

}
