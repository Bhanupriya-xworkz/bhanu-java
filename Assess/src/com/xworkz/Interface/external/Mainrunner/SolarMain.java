package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Solar;
import com.xworkz.Interface.internal.SolarPanel;

public class SolarMain {
        public static void main(String[] args) {

            Solar solar1 = new SolarPanel();
            Solar solar2 = new SolarPanel();
            Solar solar3 = new SolarPanel();

            solar1.generatePower();
            solar2.storeEnergy();
            solar3.showStatus();
        }
    }

