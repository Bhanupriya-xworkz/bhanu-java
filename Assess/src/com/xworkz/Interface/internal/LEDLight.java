package com.xworkz.Interface.internal;

    public class LEDLight implements Light {

        @Override
        public void turnOn() {
            System.out.println("LED Light is turned ON.");
        }

        @Override
        public void turnOff() {
            System.out.println("LED Light is turned OFF.");
        }

        @Override
        public void adjustBrightness() {
            System.out.println("Adjusting brightness to 75%.");
        }
    }
    @Override
    public void lightingTips() {
        System.out.println("Smart Light Tip: Schedule your lights to turn off automatically when not in use.");
    }
}

