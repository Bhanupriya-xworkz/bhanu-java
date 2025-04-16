package com.xworkz.Interface.external.Mainrunner;
import com.xworkz.Interface.internal.TourPlace;
import com.xworkz.Interface.internal.TourPlace;

public class HotspotMain {
        public static void main(String[] args) {
            Hotspot hotspot1 = new TourPlace();
            Hotspot hotspot2 = new TourPlace();
            Hotspot hotspot3 = new TourPlace();

            hotspot1.setCoordinates();
            hotspot2.showDetails();
            hotspot3.markVisited();
        }
    }

