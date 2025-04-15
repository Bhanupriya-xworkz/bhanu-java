package com.xworkz.Abstract.internal;

   public class Student extends Person {
        int studentId;

        public Student(String name, int age, String gender, int studentId) {
            super(name, age, gender);
            this.studentId = studentId;
        }

        @Override
        void displayInfo() {
            System.out.println("Student Info:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Student ID: " + studentId);
        }
    }

