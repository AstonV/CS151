package com.example;

public class Person{
    private String firstName;
    private String lastName;
    private String ssn;
    private String address;
    private String gender;
    private int age;
    private double weight;

    public Person(String firstName, String lastName, int age, String ssn, String address, String gender, Double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }


    public String getfirstName(){
        return firstName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public int getage(){
        return age;
    }

    public void setage(int age){
        this.age = age;
    }

    public String getssn(){
        return ssn;
    }

    public void setssn(String ssn){
        this.ssn = ssn;
    }

    public String getaddress(){
        return address;
    }

    public void setaddress(String address){
        this.address = address;
    }

    public String getgender(){
        return gender;
    }

    public void setgender(String gender){
        this.gender = gender;
    }

    public double getweight(){
        return weight;
    }

    public void setweight(double weight){
        this.weight = weight;
    }
    @Override
    public String toString(){

        return "Name: " + firstName + " " + lastName + "\nAge: " + age + "\nSSN: " + ssn + "\nAddress: " + address + "\nGender: " + gender + "\nWeight: " + weight;

    }

    public void introduce(){
        System.out.println(toString());
    }

}
