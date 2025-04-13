package com.xworkz.method.internal;

    public class Cup extends Container {

        public Cup() {
            System.out.println("Cup instance created.");
        }

        @Override
        public void fill() {
            System.out.println("Cup is filled with coffee.");
        }

        @Override
        public void empty() {
            System.out.println("Cup is being emptied after drinking.");
        }

        @Override
        public void clean() {
            System.out.println("Cup is being cleaned with hot water.");
        }

        @Override
        public void use() {
            System.out.println("Cup is used for drinking.");
        }

        @Override
        public void display() {
            System.out.println("Cup is displayed on the shelf.");
        }

        public void cupSpecial() {
            System.out.println("Cup has a custom message printed.");
        }
    }

