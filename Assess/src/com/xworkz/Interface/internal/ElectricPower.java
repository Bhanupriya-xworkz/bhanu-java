package com.xworkz.Interface.internal;

    public class ElectricPower implements Power {

        @Override
        public void turnOn() {
            System.out.println("Electric power is turned ON.");
        }

        @Override
        public void turnOff() {
            System.out.println("Electric power is turned OFF.");
        }

        @Override
        public void getPowerSource() {
            System.out.println("Power Source: Electricity from main grid.");
        }
    }

    @Override
    public void powerTip() {
        System.out.println("Power Tip: Consider using energy-efficient appliances to reduce power consumption.");
    }

