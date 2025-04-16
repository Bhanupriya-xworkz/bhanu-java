package com.xworkz.Interface.internal;

    public class LuxurySofa implements Sofa {

        @Override
        public void sitOn() {
            System.out.println("Sitting on the luxury sofa.");
        }

        @Override
        public void layDown() {
            System.out.println("Laying down on the luxury sofa.");
        }

        @Override
        public void clean() {
            System.out.println("Cleaning the luxury sofa with special fabric cleaner.");
        }
    }

