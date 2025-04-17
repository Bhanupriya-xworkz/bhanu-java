package com.xworkz.Interface.internal;

    public interface Fan {
        void turnOn();
        void rotate();
        void turnOff();

        default void maintenanceTips() {
            System.out.println("General Tip: Clean your fan blades regularly to ensure efficient airflow.");
        }
    }

