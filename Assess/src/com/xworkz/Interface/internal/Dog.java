package com.xworkz.Interface.internal;

    public class Dog implements Animal {

        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }

        @Override
        public void sleep() {
            System.out.println("Dog is sleeping.");
        }

        @Override
        public void makeSound() {
            System.out.println("Dog says: Woof Woof!");

        }
    }
    @Override
    public void careTips() {
        System.out.println("Dog Care Tip: Take your dog for daily walks and regular grooming.");
    }

