package com.xworkz.method.internal;

    public class SavingsAccount extends Account {

        public SavingsAccount() {
            System.out.println("SavingsAccount instance created.");
        }

        @Override
        public void open() {
            System.out.println("Savings Account is opened with minimum balance.");
        }

        @Override
        public void deposit() {
            System.out.println("Amount deposited into savings account.");
        }

        @Override
        public void withdraw() {
            System.out.println("Withdrawal from savings account.");
        }

        @Override
        public void checkBalance() {
            System.out.println("Savings account balance checked.");
        }

        @Override
        public void close() {
            System.out.println("Savings account is closed.");
        }

        public void applyInterest() {
            System.out.println("Interest applied to savings account.");
        }
    }

