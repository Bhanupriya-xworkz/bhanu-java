package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Destination;
import com.xworkz.Interface.internal.Location;

public class LocationMain {
        public static void main(String[] args) {
            Location location1 = new Destination();
            Location location2 = new Destination();
            Location location3 = new Destination();

            location1.setCoordinates();
            location2.showDetails();
            location3.markVisited();
            location1.travelTips();
        }
    }

