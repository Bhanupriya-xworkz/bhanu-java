package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.Appliance;
import com.xworkz.Interface.internal.Washingmachine;
import com.xworkz.Interface.internal.Washingmachine;

public class ApplianceMain {
        public static void main(String[] args) {
            Appliance appliance1 = new Washingmachine();
            Appliance appliance2 = new Washingmachine();
            Appliance appliance3 = new Washingmachine();

            appliance1.turnOn();
            appliance2.operate();
            appliance3.turnOff();
            myWasher.safetyTips();
        }
    }

