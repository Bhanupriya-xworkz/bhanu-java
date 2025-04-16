package com.xworkz.Interface.internal;

    public class Highway implements Road {

        @Override
        public void openRoad() {
            System.out.println("The highway is open for traffic.");
        }

        @Override
        public void closeRoad() {
            System.out.println("The highway is closed for repairs.");
        }

        @Override
        public void showCondition() {
            System.out.println("Road Condition: Smooth and well-maintained.");
        }
    }

