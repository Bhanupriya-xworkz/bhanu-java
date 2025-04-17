package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.Drone;
import com.xworkz.Interface.internal.UAVDrone;

public class Dronemain {
        public static void main(String[] args) {
            UAVDrone drone1 = new UAVDrone();
            UAVDrone drone2 = new UAVDrone();
            UAVDrone drone3 = new UAVDrone();

            UAVDrone.takeoff();
            UAVDrone.fly();
            UAVDrone.land();
            Drone.maintenanceTips();
        }
    }

