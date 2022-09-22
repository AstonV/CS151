package com.example;

public class Employee extends Person{
    private int id;
    private String status;
    private double basePay;

    public Employee(String firstName, String lastName, int age, String ssn, String address, String gender,
                    double weight, int id, String status, double basePay) {
        super(firstName, lastName, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public void introduce() {

        System.out.println(toString());
    }


    public double calculatePay(double unitWorked) {

        if (status.equalsIgnoreCase("Part time")) {

            return basePay * unitWorked;
        } else if (status.equalsIgnoreCase("Full Time")) {

            return basePay * 1 / 52 * unitWorked;
        }

        else {

            return basePay * unitWorked;
        }
    }


    @Override
    public String toString() {
        return super.toString() + "\nEmployee ID: " + id + "\nStatus: " + status + "\nBase Pay: $" + basePay;
    }

}
