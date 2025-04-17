package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.LEDLight;
import com.xworkz.Interface.internal.Light;

public class LightMain {
        public static void main(String[] args) {

            Light light1 = new LEDLight();
            Light light2 = new LEDLight();
            Light light3 = new LEDLight();

            light1.turnOn();
            light2.adjustBrightness();
            light3.turnOff();
            Light.lightingTips();
        }
    }

