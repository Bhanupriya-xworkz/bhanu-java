package com.xworkz.Interface.internal;

    public class SmartTv implements Television {
        @Override
        public void powerOn() {
            System.out.println("SmartTV executing: powerOn");
        }

        @Override
        public void streamContent() {
            System.out.println("SmartTV executing: streamContent");
        }

        @Override
        public void powerOff() {
            System.out.println("SmartTV executing: powerOff");
        }
    }

    @Override
    public void tvTip() {
        System.out.println("SmartTV Tip: Use scheduled shutdown to avoid unnecessary power usage.");
    }

