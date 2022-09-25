package com.example;

public class AnimalTest {


    public static void main(String[] args) {

        Dog d=new Dog("domestic","dog","male","home",5,30);
        Cat c=new Cat("domestic","cat","female","home",3,20);
        Racoon r=new Racoon("wild","racoon","male","forest",6,40);
        Whale w=new Whale("aquatic","whale","male","ocean",15,60);

        System.out.println();
        System.out.println(d.toString());
        d.bark();
        d.eat();
        d.greetHuman();
        d.move();
        d.sleep();
        d.sound();
        d.walk();

        System.out.println();
        System.out.println(c.toString());
        c.eat();
        c.greetHuman();
        c.move();
        c.scratch();
        c.sleep();
        c.sound();
        c.walk();

        System.out.println();
        System.out.println(r.toString());
        r.eat();
        r.move();
        r.scratch();
        r.sleep();
        r.sound();

        System.out.println();
        System.out.println(w.toString());
        w.eat();
        w.move();
        w.sleep();
        w.sound();
        w.swim();



    }
}
