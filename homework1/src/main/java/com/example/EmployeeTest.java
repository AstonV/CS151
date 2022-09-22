package com.example;

public class EmployeeTest {

    public static void main(String[] args) {

        // creating Employee objects
        Employee employee = new Employee("Joe", "Smith", 23, "890476438", "123 This Way, CA", "Male", 71, 01,
                "Contractor", 60);

        Employee employee1 = new Employee("Lisa", "Gray", 24, "123456789", "456 That Way, CA", "Female", 50, 02, "Full Time",
                110000);

        Employee employee2 = new Employee("Timothy", "Briggs", 26, "803472846", "789 Those Way, CA", "Female", 52 , 03,
                "Full Time", 80000);

        Employee employee3 = new Employee("George", "Wallace", 27, "678359647", "321 These Way, CA", "Male", 70, 04,
                "Part Time", 20);

        Employee employee4 = new Employee("Amy", "Student", 25, "478064813", "678 Another Way, CA", "Female", 45, 05,
                "Contractor", 45);

        // introduce employees and show their earnings
        employee.introduce();
        System.out.println("Employee earnings: $" + employee.calculatePay(30));
        System.out.println();
        employee1.introduce();
        System.out.println("Employee earnings: $" + employee1.calculatePay(2));
        System.out.println();
        employee2.introduce();
        System.out.println("Employee earnings: $" + employee2.calculatePay(4));
        System.out.println();
        employee3.introduce();
        System.out.println("Employee earnings: $" + employee3.calculatePay(25));
        System.out.println();
        employee4.introduce();
        System.out.println("Employee earnings: $" + employee4.calculatePay(45));
        System.out.println();

    }
}
