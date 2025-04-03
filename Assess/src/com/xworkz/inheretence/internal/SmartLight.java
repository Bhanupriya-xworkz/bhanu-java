package com.xworkz.inheretence.internal;

    public class SmartLight extends Light {
        public void SL()
        {
            System.out.println("no-args const of smart light");
        }

        {
            super.turnOn();
            System.out.println("smart light turned on");
        }

        {
            super.turnOff();
            System.out.println("smart light turned off");
        }

        {
            super.adjustBrightness();
            System.out.println("smart light brightness adjusted");
        }

        {
            super.changeColor();
            System.out.println("smart light color changed");
        }
    }

