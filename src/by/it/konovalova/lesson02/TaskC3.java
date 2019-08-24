package by.it.konovalova.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        double j = getWeight(i);
       // System.out.printf("%.2f" , j);
       System.out.println(j);
    }
        private static double getWeight(int weight) {
        double gz = 9.81 ;
        //double mz = weight / gz;
         //   double roundOff1 = (double) Math.round(mz * 100)/100;
        double gm = 3.86;
        //double mm = weight / gm;
         //   double roundOff2 = (double) Math.round(mm * 100)/100;
        double weight1 = gm * weight / gz;
        return (double) Math.round(weight1 * 100)/100;
            //weight1 = (Double)Math.floor(weight1*100)/100.0;
        //double roundOff = Math.round(weight1 * 100.0)/100.0;


    }
    /*public static void main(String[] args) {
        double i = 5.55;
        double j = 6.9;
        double k = i * j;
        double roundOff = (double) Math.round(k * 100)/100;
        System.out.printf("%.2f" , roundOff);
    }*/
}
