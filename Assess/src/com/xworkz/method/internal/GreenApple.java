package com.xworkz.method.internal;

    public class GreenApple extends Apple {

        public GreenApple() {
            System.out.println("Green Apple is created...");
        }

        @Override
        public void grow() {
            System.out.println("Green Apple is growing on a tree...");
        }

        @Override
        public void ripen() {
            System.out.println("Green Apple is ripening to a tart taste...");
        }

        @Override
        public void pluck() {
            System.out.println("Green Apple is being plucked from the tree...");
        }

        @Override
        public void eat() {
            System.out.println("Green Apple is being eaten with a tangy flavor...");
        }

        @Override
        public void juice() {
            System.out.println("Green Apple juice is being made...");
        }

        @Override
        public void store() {
            System.out.println("Green Apple is being stored in a cool place...");
        }
    }

