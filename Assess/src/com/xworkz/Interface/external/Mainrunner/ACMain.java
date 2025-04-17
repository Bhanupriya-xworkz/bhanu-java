package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.AC;
import com.xworkz.Interface.internal.Airconditioner;

    public class ACMain {
        public static void main(String[] args) {
            AC ac1 = new Airconditioner();
            ac1.turnOn();
            ac1.setTemperature();
            ac1.turnOff();
            ac2.maintenanceTips();
        }
    }

