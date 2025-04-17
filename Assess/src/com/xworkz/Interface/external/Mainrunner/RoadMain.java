package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Highway;
import com.xworkz.Interface.internal.Road;

public class RoadMain {
        public static void main(String[] args) {

            Road road1 = new Highway();
            Road road2 = new Highway();
            Road road3 = new Highway();

            road1.openRoad();
            road2.showCondition();
            road3.closeRoad();
            road.roadSafetyTip();
        }
    }

