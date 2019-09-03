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


    private int weight;
    private double power;

    public Dog(String name1, int age1, int weight, double power) {
        this.name = name1;
        this.age = age1;
        this.weight = weight;
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }


    boolean win(Dog otherDog) {
        double my = 20 * this.age + 30 * this.weight + 50 * this.power;
        double other = 20 * otherDog.age + 30 * otherDog.weight + 50 * otherDog.power;
        if (my > other) return true;
        else return false;
    }

}
