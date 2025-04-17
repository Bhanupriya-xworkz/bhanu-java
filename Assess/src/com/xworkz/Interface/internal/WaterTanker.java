package com.xworkz.Interface.internal;

    public class WaterTanker implements Tanker {

        @Override
        public void load() {
            System.out.println("Loading water into the tanker...");
        }

        @Override
        public void unload() {
            System.out.println("Unloading water at the destination...");
        }

        @Override
        public void checkCapacity() {
            System.out.println("Tanker capacity: 10,000 liters");
        }
    }
    @Override
    public void tankerTip() {
        System.out.println("Oil Tanker Tip: Never exceed the maximum load limit to avoid accidents.");
    }

