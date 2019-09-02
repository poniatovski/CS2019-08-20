package by.it.konovalova.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/


public class TaskC3 {
    public static void main(String[] args) {
        int i = 2;
        int j = 2;
        int k, k1;
        while (i <= 10) {
            while (j <= 10) {

                switch (i) {
                    case 1:
                        System.out.print("один");
                        break;
                    case 2:
                        System.out.print("два");
                        break;
                    case 3:
                        System.out.print("три");
                        break;
                    case 4:
                        System.out.print("четыре");
                        break;
                    case 5:
                        System.out.print("пять");
                        break;
                    case 6:
                        System.out.print("шесть");
                        break;
                    case 7:
                        System.out.print("семь");
                        break;
                    case 8:
                        System.out.print("восемь");
                        break;
                    case 9:
                        System.out.print("девять");
                        break;
                    case 10:
                        System.out.print("десять");
                        break;
                }
                System.out.print(" умножить на ");

                switch (j) {
                    case 1:
                        System.out.print("один");
                        break;
                    case 2:
                        System.out.print("два");
                        break;
                    case 3:
                        System.out.print("три");
                        break;
                    case 4:
                        System.out.print("четыре");
                        break;
                    case 5:
                        System.out.print("пять");
                        break;
                    case 6:
                        System.out.print("шесть");
                        break;
                    case 7:
                        System.out.print("семь");
                        break;
                    case 8:
                        System.out.print("восемь");
                        break;
                    case 9:
                        System.out.print("девять");
                        break;
                    case 10:
                        System.out.print("десять");
                        break;
                }
                System.out.print(" равно ");
                k = i * j;
                if (k < 20) {
                    switch (k) {
                        case 1:
                            System.out.print("один");
                            break;
                        case 2:
                            System.out.print("два");
                            break;
                        case 3:
                            System.out.print("три");
                            break;
                        case 4:
                            System.out.print("четыре");
                            break;
                        case 5:
                            System.out.print("пять");
                            break;
                        case 6:
                            System.out.print("шесть");
                            break;
                        case 7:
                            System.out.print("семь");
                            break;
                        case 8:
                            System.out.print("восемь");
                            break;
                        case 9:
                            System.out.print("девять");
                            break;
                        case 10:
                            System.out.print("десять");
                            break;
                        case 11:
                            System.out.print("одиннадцать");
                            break;
                        case 12:
                            System.out.print("двенадцать");
                            break;
                        case 13:
                            System.out.print("тринадцать");
                            break;
                        case 14:
                            System.out.print("четырнадцать");
                            break;
                        case 15:
                            System.out.print("пятнадцать");
                            break;
                        case 16:
                            System.out.print("шестнадцать");
                            break;
                        case 17:
                            System.out.print("семнадцать");
                            break;
                        case 18:
                            System.out.print("восемнадцать");
                            break;
                        case 19:
                            System.out.print("девятнадцать");
                            break;
                    }
                }
                if (k >= 20 && k <= 100)

                    switch (k / 10 * 10) {
                        case 20:
                            System.out.print("двадцать ");
                            break;
                        case 30:
                            System.out.print("тридцать ");
                            break;
                        case 40:
                            System.out.print("сорок ");
                            break;
                        case 50:
                            System.out.print("пятьдесят ");
                            break;
                        case 60:
                            System.out.print("шестьдесят ");
                            break;
                        case 70:
                            System.out.print("семьдесят ");
                            break;
                        case 80:
                            System.out.print("восемьдесят ");
                            break;
                        case 90:
                            System.out.print("девяносто ");
                            break;
                        case 100:
                            System.out.print("сто");
                            break;
                    }
                k1 = k%10;
                if (k1 > 0 && k > 20) {
                    switch (k1) {
                        case 1:
                            System.out.print("один");
                            break;
                        case 2:
                            System.out.print("два");
                            break;
                        case 3:
                            System.out.print("три");
                            break;
                        case 4:
                            System.out.print("четыре");
                            break;
                        case 5:
                            System.out.print("пять");
                            break;
                        case 6:
                            System.out.print("шесть");
                            break;
                        case 7:
                            System.out.print("семь");
                            break;
                        case 8:
                            System.out.print("восемь");
                            break;
                        case 9:
                            System.out.print("девять");
                            break;
                        case 10:
                            System.out.print("десять");
                            break;
                    }
                }
                System.out.println();
                j++;
            }
            j = j - 10;
            i++;
        }
    }
}


  /*  public static void main(String[] args) {
        int i = 2;
        int j = 2;
        while (i <= 10) {
            while (j <= 10) {
                System.out.println(i + " умножить на " + j + " равно " + (i * j));
                j++;
            }
            j = j - 10;
            i++;
        }
    }
}*/
