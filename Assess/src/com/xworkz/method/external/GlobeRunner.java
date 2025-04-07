package com.xworkz.method.external;

import com.xworkz.method.internal.Globe;
import com.xworkz.method.internal.SmartGlobe;

    public class GlobeRunner {

        public static void main(String[] args) {

            // Creating Globe object
            Globe globe1 = new Globe();
            globe1.rotate();
            globe1.display();
            globe1.hold();
            globe1.clean();
            globe1.store();
            globe1.lightUp();

            System.out.println("=============");

            // Creating SmartGlobe object
            SmartGlobe smartGlobe = new SmartGlobe();
            smartGlobe.rotate();
            smartGlobe.display();
            smartGlobe.hold();
            smartGlobe.clean();
            smartGlobe.store();
            smartGlobe.lightUp();
        }
    }

