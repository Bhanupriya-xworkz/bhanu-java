package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.HotSpot;
import com.xworkz.Interface.internal.TourPlace;

public class HotspotMain {
        public static void main(String[] args) {
            HotSpot hotspot1 = new TourPlace();
            HotSpot hotspot2 = new TourPlace();
            HotSpot hotspot3 = new TourPlace();

            hotspot1.setCoordinates();
            hotspot2.showDetails();
            hotspot3.markVisited();
            HotSpot.hotspotTips();
        }
    }

