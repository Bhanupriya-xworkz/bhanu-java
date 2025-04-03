package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Vehicle;
import com.xworkz.inheretence.internal.Vehicle;

public class VehicleRunner {
        public static void main(String[] args) {

            Vehicle vehicle = new Car();

            Vehicle basicVehicle = new Vehicle();

            vehicle.startEngine();
            vehicle.stopEngine();
            vehicle.refuel();
            vehicle.checkTires();
            vehicle.honk();
            ((Car) vehicle).openTrunk();
            ((Car) vehicle).turnOnAC();
            ((Car) vehicle).checkFuelLevel();

            basicVehicle.startEngine();
            basicVehicle.checkTires();
        }
    }

