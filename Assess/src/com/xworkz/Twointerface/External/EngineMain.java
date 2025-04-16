package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Car;
import com.xworkz.Twointerface.Internal.Engine;

public class MainClass {
        public static void main(String[] args) {

            Engine vehicle1 = new Car();
            Engine vehicle2 = new Truck();

            Fuel fuel1 = new Car();
            Fuel fuel2 = new Truck();

            vehicle1.start();
            vehicle1.stop();
            vehicle2.start();
            vehicle2.stop();

            fuel1.fuelType();
            fuel1.fuelEfficiency();
            fuel2.fuelType();
            fuel2.fuelEfficiency();
        }
    }

