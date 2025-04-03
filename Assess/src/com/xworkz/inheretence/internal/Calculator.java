package com.xworkz.inheretence.internal;

    public class Calculator {
        public void C()
        {
            System.out.println("no-args const of calculator");
        }

        public void add(int a, int b)
        {
            System.out.println("Addition result: " + (a + b));
        }

        public void subtract(int a, int b)
        {
            System.out.println("Subtraction result: " + (a - b));
        }

        public void multiply(int a, int b)
        {
            System.out.println("Multiplication result: " + (a * b));
        }

        public void divide(int a, int b)
        {
            if (b != 0)
                System.out.println("Division result: " + (a / b));
            else
                System.out.println("Cannot divide by zero");
        }
    }

