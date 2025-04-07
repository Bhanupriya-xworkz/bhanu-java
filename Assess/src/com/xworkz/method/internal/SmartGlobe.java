package com.xworkz.method.internal;

    public class SmartGlobe extends Globe {

        public SmartGlobe() {
            System.out.println("SmartGlobe is created...");
        }

        @Override
        public void rotate() {
            System.out.println("SmartGlobe rotates with touch control...");
        }

        @Override
        public void display() {
            System.out.println("SmartGlobe displays interactive maps with touch features...");
        }

        @Override
        public void hold() {
            System.out.println("SmartGlobe can be held with a rotating stand...");
        }

        @Override
        public void clean() {
            System.out.println("SmartGlobe is self-cleaning with a touch of a button...");
        }

        @Override
        public void store() {
            System.out.println("SmartGlobe is stored in a protective case...");
        }

        @Override
        public void lightUp() {
            System.out.println("SmartGlobe lights up with customizable LED colors...");
        }
    }
