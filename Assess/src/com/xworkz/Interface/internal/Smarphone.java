package com.xworkz.Interface.internal;

    public class Smartphone implements Gadget {

        @Override
        public void powerOn() {
            System.out.println("Smartphone is powering on...");
        }

        @Override
        public void showSpecs() {
            System.out.println("Specs: Snapdragon Processor, 8GB RAM, 128GB Storage, 5000mAh Battery.");
        }

        @Override
        public void shutdown() {
            System.out.println("Smartphone is shutting down...");
        }
    }

    @Override
    public void phoneTip() {
        System.out.println("Phone Tip: Use screen time tools to manage digital wellbeing.");
    }

