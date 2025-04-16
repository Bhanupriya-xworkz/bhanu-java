package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Location;
import com.xworkz.Interface.internal.Zoo;
import com.xworkz.Interface.internal.ZooLocation;

public class ZooMain {
        public static void main(String[] args) {
            Location zoo1 = new ZooLocation();
            Location zoo2 = new ZooLocation();
            Location zoo3 = new ZooLocation();

            zoo1.setCoordinates();
            zoo2.showDetails();
            zoo3.markVisited();
        }
    }

