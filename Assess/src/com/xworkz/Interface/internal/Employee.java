package com.xworkz.Interface.internal;

    public interface Employee {
        void work();
        void takeBreak();
        void report();

        default void companyPolicy() {
            System.out.println("General Tip: Follow the company’s policies on attendance and communication.");
        }
    }

