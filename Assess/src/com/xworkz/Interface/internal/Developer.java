package com.xworkz.Interface.internal;

    public class Developer implements Employee {

        @Override
        public void work() {
            System.out.println("Developer is writing Java code.");
        }

        @Override
        public void takeBreak() {
            System.out.println("Developer is grabbing a coffee break.");
        }

        @Override
        public void report() {
            System.out.println("Developer submitted daily stand-up report.");
        }
    }
    @Override
    public void companyPolicy() {
        System.out.println("Software Engineer Tip: Keep detailed documentation for all your code and projects.");
    }

