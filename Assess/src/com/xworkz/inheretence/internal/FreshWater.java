package com.xworkz.inheretence.internal;

    public class FreshWater extends Water {
        public void freshWaterInfo() {
            System.out.println("This is fresh water, which is naturally occurring water that is not salty.");
        }

        {
            super.types();
            System.out.println("Freshwater makes up a small percentage of the Earth's water, mostly found in lakes, rivers, and groundwater.");
        }

        {
            super.importance();
            System.out.println("Freshwater is crucial for drinking, irrigation, and many industrial uses.");
        }

        {
            super.cycle();
            System.out.println("Freshwater is replenished through precipitation and filtration of surface water.");
        }

        {
            super.properties();
            System.out.println("Freshwater has a lower salinity compared to seawater and is ideal for consumption.");
        }
    }

