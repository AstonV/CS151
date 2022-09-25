package com.example;

public class Cat extends Animal implements Domesticated,Scratcher{
    public Cat(String type, String name, String gender, String environment, int age, int speed) {
        super(type, name, gender, environment, age, speed);
    }
    void move(){
        System.out.println("cat move");
    }
    void sound(){
        System.out.println("cat sound");
    }
    void eat(){
        System.out.println("cat eat");
    }
    void sleep(){
        System.out.println("cat sleep");
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void walk() {
        System.out.println(" cat walk");
    }

    @Override
    public void greetHuman() {
        System.out.println(" cat greet human");
    }


    @Override
    public void scratch() {
        System.out.println(" cat scratch");
    }
}
