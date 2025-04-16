package com.xworkz.Interface.internal;

    public class MicrowaveOven implements Microwave {
        @Override
        public void setTimer() {
            System.out.println("MicrowaveOven executing: setTimer");
        }

        @Override
        public void heatFood() {
            System.out.println("MicrowaveOven executing: heatFood");
        }

        @Override
        public void stopHeating() {
            System.out.println("MicrowaveOven executing: stopHeating");
        }
    }

