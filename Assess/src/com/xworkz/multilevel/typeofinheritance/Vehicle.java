package com.xworkz.multilevel.typeofinheritance;

    public class Vehicle {
        public void start() {
            System.out.println("Vehicle starts");
        }
    }

    class Car extends Vehicle {
        public void drive() {
            System.out.println("Car drives");
        }
    }

    public class Main {
        public static void main(String[] args) {
            SportsCar sc = new SportsCar();
            sc.start();
            sc.drive();
            sc.turboBoost();
        }
    }
