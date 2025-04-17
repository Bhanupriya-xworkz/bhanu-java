package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.LEDLightBulb;
import com.xworkz.Interface.internal.LightBulb;

public class LightBulbMain {
        public static void main(String[] args) {
            LightBulb ledBulb = new LEDLightBulb();
            ledBulb.switchOn();
            ledBulb.adjustBrightness();
            ledBulb.switchOff();
        }
    }

