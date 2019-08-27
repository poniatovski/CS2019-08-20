package prikhodko.lesson03;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static void main(String[] args) {
        int i = 5467;
        System.out.println(sumDigitsInNumber(5467));
    }

    public static int sumDigitsInNumber(int i) {
        int m1 = i / 1000;
        int m2 = i / 100 - m1 * 10;
        int m3 = i / 10 - m2 * 10 - m1 * 100;
        int m4 = i - m3 * 10 - m2 * 100 - m1 * 1000;
        return (m1 + m2 + m3 + m4);
    }
}



//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

