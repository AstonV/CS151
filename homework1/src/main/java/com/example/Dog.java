package com.example;

public class Dog extends Animal implements Domesticated{
    public Dog(String type, String name, String gender, String environment, int age, int speed) {
        super(type, name, gender, environment, age, speed);
    }

    void move(){
        System.out.println("dog move");
    }
    void sound(){
        System.out.println("dog sound");
    }
    void eat(){
        System.out.println("dog eat");
    }
    void sleep(){
        System.out.println("dog sleep");
    }

    void bark(){
        System.out.println("bark");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void walk() {
        System.out.println("dig walk");
    }

    @Override
    public void greetHuman() {
        System.out.println("dog greet human");
    }
}
