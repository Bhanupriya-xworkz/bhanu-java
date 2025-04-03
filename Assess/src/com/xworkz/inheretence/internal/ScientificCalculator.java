package com.xworkz.inheretence.internal;

    public class ScientificCalculator extends Calculator {
        public void SC()
        {
            System.out.println("no-args const of scientific calculator");
        }

        {
            super.add(5, 3);
            System.out.println("scientific calculator performed addition");
        }

        {
            super.subtract(10, 4);
            System.out.println("scientific calculator performed subtraction");
        }

        {
            super.multiply(6, 7);
            System.out.println("scientific calculator performed multiplication");
        }

        {
            super.divide(20, 5);
            System.out.println("scientific calculator performed division");
        }

        public void sin(double angle)
        {
            System.out.println("Sin of " + angle + " is: " + Math.sin(Math.toRadians(angle)));
        }

        public void cos(double angle)
        {
            System.out.println("Cos of " + angle + " is: " + Math.cos(Math.toRadians(angle)));
        }

        public void tan(double angle)
        {
            System.out.println("Tan of " + angle + " is: " + Math.tan(Math.toRadians(angle)));
        }
    }

