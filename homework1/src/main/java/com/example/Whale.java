package com.example;

public class Whale extends Animal implements Swimmers{
    public Whale(String type, String name, String gender, String environment, int age, int speed) {
        super(type, name, gender, environment, age, speed);
    }
    void move(){
        System.out.println("Whale move");
    }
    void sound(){
        System.out.println("Whale sound");
    }
    void eat(){
        System.out.println("Whale eat");
    }
    void sleep(){
        System.out.println("Whale sleep");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void swim() {
        System.out.println("Whale swim");
    }
}
