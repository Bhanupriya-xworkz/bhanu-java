package com.xworkz.Twointerface.External;

import com.xworkz.Twointerface.Internal.Building;
import com.xworkz.Twointerface.Internal.Cottage;

public class MainClass {
        public static void main(String[] args) {
            Building b1 = new Skyscraper();
            Building b2 = new Cottage();

            b1.getName();
            b2.getFloors();

            Architecture a1 = new Skyscraper();
            Architecture a2 = new Cottage();

            a1.getStyle();
            a2.getMaterialUsed();
        }
    }

