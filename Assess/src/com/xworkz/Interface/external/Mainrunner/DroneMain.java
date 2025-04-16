package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Drone;
import com.xworkz.Interface.internal.Quadcopter;

    public class DroneMain {
        public static void main(String[] args) {
            Drone drone1 = new Quadcopter();
            drone1.takeOff();
            drone1.fly();
            drone1.land();
        }
    }

