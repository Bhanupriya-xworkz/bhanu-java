package com.xworkz.Interface.internal;

    public interface Animal {
        void eat();

        void sleep();

        void makeSound();

        default void careTips() {
            System.out.println("General Animal Care Tip: Provide clean water and regular vet checkups.");
        }
    }

