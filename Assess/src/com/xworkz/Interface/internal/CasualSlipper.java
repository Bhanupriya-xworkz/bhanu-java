package com.xworkz.Interface.internal;

    public class CasualSlipper implements Slipper {

        @Override
        public void wear() {
            System.out.println("Wearing casual slippers.");
        }

        @Override
        public void remove() {
            System.out.println("Removing casual slippers.");
        }

        @Override
        public void clean() {
            System.out.println("Cleaning the slippers with water.");
        }
    }

