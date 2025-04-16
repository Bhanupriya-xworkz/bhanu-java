package com.xworkz.Interface.internal;

    public class Laptop implements Computer {
        @Override
        public void powerOn() {
            System.out.println("Laptop executing: powerOn");
        }

        @Override
        public void runProgram() {
            System.out.println("Laptop executing: runProgram");
        }

        @Override
        public void shutDown() {
            System.out.println("Laptop executing: shutDown");
        }
    }

