package com.xworkz.Interface.internal;

    public interface AC {
        void turnOn();
        void setTemperature();
        void turnOff();

        default void maintenanceTips() {
            System.out.println("General Maintenance Tip: Clean filters every month.");
        }

    }

