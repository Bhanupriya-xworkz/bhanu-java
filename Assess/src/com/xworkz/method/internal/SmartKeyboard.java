package com.xworkz.method.internal;

    public class SmartKeyboard extends Keyboard {

        public SmartKeyboard() {
            System.out.println("SmartKeyboard is created...");
        }

        @Override
        public void type() {
            System.out.println("Typing on the smart keyboard with backlight...");
        }

        @Override
        public void connect() {
            System.out.println("SmartKeyboard is connected wirelessly via Bluetooth...");
        }

        @Override
        public void clean() {
            System.out.println("SmartKeyboard is being cleaned with automated tech...");
        }

        @Override
        public void disconnect() {
            System.out.println("SmartKeyboard is disconnected wirelessly...");
        }

        @Override
        public void changeBatteries() {
            System.out.println("SmartKeyboard has rechargeable batteries...");
        }

        @Override
        public void store() {
            System.out.println("SmartKeyboard is stored in a sleek case...");
        }
    }
