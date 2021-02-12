package ru.Vasilio.Employee;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;


    Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник младше 18 лет");
        }
    }

    int getAge() {
        return age;
    }

    void isInfo() {
        System.out.println(fullName + " " + position + " " + email + " " + phoneNumber + " Зарплата: " + salary + " Возраст: " + age + " ");
    }
}

