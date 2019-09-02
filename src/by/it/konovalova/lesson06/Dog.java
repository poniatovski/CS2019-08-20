package by.it.konovalova.lesson06;

import java.util.Scanner;

public class Dog {

    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;
    }

/*
    private int weight;
    private double power;

    public Dog(String name1, int age1, int weight, double power) {
        this.name = name1;
        this.age = age1;
        this.weight = weight;
        this.power = power;
    }

    public String getName1() {
        return name;
    }

    public void setName1(String name1) {
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();
    }

    public int getAge1() {
        return age;
    }

    public void setAge1(int age1) {
        Scanner sc = new Scanner(System.in);
        this.age = sc.nextInt();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        Scanner sc = new Scanner(System.in);
        this.weight = sc.nextInt();
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        Scanner sc = new Scanner(System.in);
        this.power = sc.nextDouble();
    }


    boolean win(Dog dog, Dog otherDog) {
        double my = 20 * this.age + 30 * this.weight + 50 * this.power;
        double other = 20 * otherDog.age + 30 * otherDog.weight + 50 * otherDog.power;
        if (my > other) return true;
        else return false;
        /*double age3 = 0.2 * dog.age;
        double weight3 = 0.3 * dog.weight;
        double power3 = 0.5 * dog.power;
        double age4 = 0.2 * otherDog.age;
        double weight4 = 0.3 * otherDog.weight;
        double power4 = 0.5 * otherDog.power;
        if (age3 + weight3 + power3 > age4 + weight4 + power4) return true;
        else return false;*/
}


