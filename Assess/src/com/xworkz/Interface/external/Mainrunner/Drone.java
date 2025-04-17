package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.FiveInterface.Internal.SmartPhone;

public class Drone {
        public static void main(String[] args) {
            UAVDrone Drone = new UAVDrone();
            UAVDrone.powerOn();
            UAVDrone.makeCall("123-456-7890");
            UAVDrone.takePhoto();
            UAVDrone.playMusic("Shape of You");
            UAVDrone.browseInternet();
            UAVDrone.downloadApp("Instagram");
            UAVDrone.startNavigation("Central Park");
            UAVDrone.powerOff();
        }
    }

