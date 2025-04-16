package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.Beach;
import com.xworkz.Interface.internal.BeachLocation;

public class BeachMain {
        public static void main(String[] args) {
            BeachLocation beach1 = new BeachLocation();
            BeachLocation beach2 = new BeachLocation();
            BeachLocation beach3 = new BeachLocation();

            beach1.setCoordinates();
            beach2.showDetails();
            beach3.markVisited();
        }
    }

