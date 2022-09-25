package com.example;

public class Racoon extends Animal implements Scratcher {
    public Racoon(String type, String name, String gender, String environment, int age, int speed) {
        super(type, name, gender, environment, age, speed);
    }
    void move(){
        System.out.println("Racoon move");
    }
    void sound(){
        System.out.println("Racoon sound");
    }
    void eat(){
        System.out.println("Racoon eat");
    }
    void sleep(){
        System.out.println("Racoon sleep");
    }



    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void scratch() {
        System.out.println(" Racoon scratch");
    }
}
