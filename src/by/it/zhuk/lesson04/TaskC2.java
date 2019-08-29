package by.it.zhuk.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jan = 31; int feb = 28; int mar = 31;
        int apr = 30; int may = 31; int june = 30;
        int july = 31; int aug = 31; int sep = 30;
        int oct = 31; int nov = 30; int dec = 31;
   
        int date = sc.nextInt();
        int month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println(date);
                break;
            case 2:
                System.out.println(jan+date);
                break;
            case 3:
                System.out.println(jan+feb+date);
                break;
            case 4:
                System.out.println(jan+feb+mar+date);
                break;
            case 5:
                System.out.println(jan+feb+mar+apr+date);
                break;
            case 6:
                System.out.println(jan+feb+mar+apr+may+date);
                break;
            case 7:
                System.out.println(jan+feb+mar+apr+may+june+date);
                break;
            case 8:
                System.out.println(jan+feb+mar+apr+may+june+july+date);
                break;
            case 9:
                System.out.println(jan+feb+mar+apr+may+june+july+aug+date);
                break;
            case 10:
                System.out.println(jan+feb+mar+apr+may+june+july+aug+sep+date);
                break;
            case 11:
                System.out.println(jan+feb+mar+apr+may+june+july+aug+sep+oct+date);
                break;
            case 12:
                System.out.println(jan+feb+mar+apr+may+june+july+aug+sep+oct+nov+date);
                break;
            default:
                System.out.println("нет такого месяца или даты");
        }
        
                
    }

}
