package ru.gb.jca.l5.hw;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private  int age;

    public Employee (String fullName, String position, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("ФИО: " + fullName + "; Должность: " + salary + "; email: " + email + "; тел.: "
                + phoneNumber + "; зарплата " + salary + "; Возраст: " + age);
    }
    public int getAge(){
        return this.age;
    }

    public  boolean isRetired() {
        return  this.age >= 60;
    }
    }

