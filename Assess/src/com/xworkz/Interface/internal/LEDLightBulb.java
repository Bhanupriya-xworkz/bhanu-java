package com.xworkz.Interface.internal;

    public class LEDLightBulb implements LightBulb {
        @Override
        public void switchOn() {
            System.out.println("LED light bulb switched ON.");
        }

        @Override
        public void switchOff() {
            System.out.println("LED light bulb switched OFF.");
        }

        @Override
        public void adjustBrightness() {
            System.out.println("Adjusting LED light bulb brightness.");
        }
    }
    @Override
    public void energySavingTip() {
        System.out.println("Smart LED Tip: Dim your lights when full brightness isn’t needed to save more energy.");
    }

