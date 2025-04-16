package com.xworkz.multilevel.typeofinheritance;

    public class Food {
        public void prepare() {
            System.out.println("Food is being prepared.");
        }
    }

    class FastFood extends Food {
        public void pack() {
            System.out.println("Fast food is being packed.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Burger burger = new Burger();
            burger.prepare();
            burger.pack();
        }
    }
