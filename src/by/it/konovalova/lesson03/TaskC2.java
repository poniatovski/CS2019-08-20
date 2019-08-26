package by.it.konovalova.lesson03;

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
        System.out.println(sumDigitsInNumber(i));
    }

    public static int sumDigitsInNumber(int i) {
        int j1 = i / 1000;
        int j2 = (i / 100) - (j1 * 10);
        int j3 = (i / 10) - (j2 * 10) - (j1 * 100);
        int j4 = i - (j3 * 10) - (j2 * 100) - (j1 * 1000);
        int sum = j1 + j2 + j3 + j4;
        return (int) sum;
    }


//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}
