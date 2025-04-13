package com.xworkz.method.external;

import com.xworkz.inheretence.internal.Light;
import com.xworkz.method.internal.SmartLight;

public class LightRunner {
        public static void main(String[] args) {

            System.out.println("Using SmartLight object:");
            SmartLight smart = new SmartLight();
            smart.turnOn();
            smart.turnOff();
            smart.dim();
            smart.brighten();
            smart.blink();
            smart.schedule();

            System.out.println("=====================");

            Light basic = new Light();
            basic.turnOn();
            basic.turnOff();
            basic.dim();
            basic.brighten();
            basic.blink();

            System.out.println("=====================");

            LightingSystem system = new LightingSystem();
            system.Dbc(basic);
            system.Dbc(system);
        }
    }

