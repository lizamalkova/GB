package ru.gb.homework;

public class Employee {
    String name;
    String role;
    String email;
    String phone_number;
    int salary;
    int age;

     public Employee(String name, String role, String email,
                    String phone_number, int salary, int age) {

         this.name = name;
         this.role = role;
         this.email = email;
         this.phone_number = phone_number;
         this.salary = salary;
         this.age = age;

    }

    void employeeInfo(){
        System.out.println("ФИО: " + name + "; Должность: " +
                role + "; Email: " + email + "; Телефон: " + phone_number +
                "; Зарплата: " + salary + "; Возраст: " + age);
    }



}
