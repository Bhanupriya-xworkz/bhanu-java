package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Car;
import com.xworkz.Twointerface.Internal.Vehicle;

public class VehicleMain {
        public static void main(String[] args) {
            Vehicle v1 = new Car();
            Vehicle v2 = new Motorcycle();

            v1.start();
            v2.stop();

            Fuel f1 = new Car();
            Fuel f2 = new Motorcycle();

            f1.fuelType();
            f2.fuelEfficiency();
        }
    }

