package com.xworkz.Abstract.internal;

    class Manager extends Employee {

        public Manager(String name, int age, String department) {
            super(name, age, department);
        }

        @Override
        void displayDetails() {
            System.out.println("Manager Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
        }
    }

