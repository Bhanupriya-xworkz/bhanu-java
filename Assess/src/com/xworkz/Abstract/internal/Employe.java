package com.xworkz.Abstract.internal;

abstract class Employee {
        String name;
        int age;
        String department;
        double salary;

        public Employee(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = 0.0;
        }

        abstract void displayDetails();
    }

