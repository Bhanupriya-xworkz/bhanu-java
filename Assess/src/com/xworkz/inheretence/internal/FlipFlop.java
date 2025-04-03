package com.xworkz.inheretence.internal;
public class FlipFlop extends Slipper {

        public FlipFlop() {
            super();  // Calling the parent class constructor
            System.out.println("FlipFlop constructor");
        }

        public void checkFit() {
            super.checkFit();
            System.out.println("Checking the fit of the FlipFlop...");
        }

        public void checkComfort() {
            super.checkComfort();
            System.out.println("Checking the comfort of the FlipFlop...");
        }

        public void checkDurability() {
            super.checkDurability();
            System.out.println("Checking the durability of the FlipFlop...");
        }

        public void checkStyle() {
            super.checkStyle();
            System.out.println("Checking the style of the FlipFlop...");
        }

        public void checkSize() {
            super.checkSize();
            System.out.println("Checking the size of the FlipFlop...");
        }
    }

