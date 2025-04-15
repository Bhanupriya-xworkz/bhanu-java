package com.xworkz.Abstract.internal;

    public abstract class Person {
        String name;
        int age;
        String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        abstract void displayInfo();
    }

